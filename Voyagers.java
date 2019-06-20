import java.net.*;
 import java.awt.*;
 import java.awt.event.*;
 import com.sun.java.swing.*;
 import java.io.*; 
import javax.swing.JButton;
import javax.swing.JToolBar;
 
 //The main class 

/**
 *
 * @author meemr
 */
 public class Voyagers implements ActionListener,Runnable 
 { 
 public final int SCROLLBARS_VERTICAL_ONLY = 1; 
 Thread thread; 
 String resource, host, file, url, ReloadReaderCount; 
 String PrevFileContents,NextFileContent, FileGoGetter; 
 HTTP webconnect; 
 TextField textfield; 
 Frame frame; 
 TextArea textarea; 
 JButton back,forward,home,stop,reload; 
 MenuItem open,save,exits; 
 int Eternal=2; 
 int TextAreaFileNameContent,SavedFileReaderCount;
 int urlLength,slash,count,increment; 
 
 //The first function to be called. 
 //It creates an object that looks like the voyagers class.
 public static void main(String s[]) 
 { 
 Voyagers MyBrowser=new Voyagers(); 
 MyBrowser.Intializer(); 
 }
 
 //This is the initialization method.
 //It initializes the various components of the interface.
 public void Intializer() 
 {
 File creator=new File("UrlHistory");
 creator.mkdir();
 File OldFiles=new File("UrlHistory\\"); 
 String ListOfOldFiles[] = OldFiles.list(); 
 int NumberOfOldFiles = ListOfOldFiles.length; 
 for(int OldFilesCount=0; OldFilesCount< NumberOfOldFiles; OldFilesCount++)
 {
 File DeleteFiles=new File("UrlHistory\\" + ListOfOldFiles[OldFilesCount]);
 DeleteFiles.delete();
 } 
 frame = new Frame("VOYAGER"); 
 frame.setLayout(new BorderLayout()); 
 textfield=new TextField("127.0.0.1",20); 
 textarea =new TextArea("",10,50,SCROLLBARS_VERTICAL_ONLY); 
 textarea.setEditable(false); 
 MenuBar menubar=new MenuBar(); 
 Menu menu = menubar.add(new Menu("File")); 
 open = (MenuItem)menu.add(new MenuItem("Open")); 
 open.addActionListener(this); 
 save = (MenuItem)menu.add(new MenuItem("Save")); 
 save.addActionListener(this); 
 exits = (MenuItem)menu.add(new MenuItem("Exit")); 
 exits.addActionListener(this); 
 menubar.add(menu); 
 JToolBar toolbar = new JToolBar(); 
 back = (JButton)toolbar.add(new JButton(" <<= Back ")); 
 back.addActionListener(this); 
 back.setEnabled(false); 
 forward = (JButton)toolbar.add(new JButton(" =>> Forward ")); 
 forward.addActionListener(this); 
 forward.setEnabled(false); 
 home = (JButton)toolbar.add(new JButton(" <<=>>Home ")); 
 home.addActionListener(this); 
 stop = (JButton)toolbar.add(new JButton(" << Stop >> ")); 
 stop.addActionListener(this); 
 stop.setEnabled(false); 
 reload = (JButton)toolbar.add(new JButton(" <<=>> Reload <<=>>")); 
 reload.addActionListener(this); 
 reload.setEnabled(false); 
 frame.add(toolbar,"North"); 
 frame.add(textfield,"South"); 
 textfield.addActionListener(this); 
 frame.add(textarea,"Center"); 
 frame.setMenuBar(menubar); 
 frame.resize(650,450); 
 frame.show(); 
 HomePage(); 
 }
 
 //This method is self-explanatory.
 //It traps all actions performed by the user on the
 //various components of the application.
 public void actionPerformed(ActionEvent e) 
 {
 //This if condition is satisfied whenever any
 //action is performed on the textfield component. 
 if(e.getSource() == textfield) 
 {
 url = ((TextField)e.getSource()).getText(); 
 urlLength = url.length(); 
 thread=new Thread(this); 
 thread.start(); 
 }
 
 //This condition is satisfied whenever the
 //user clicks on the back button on the user interface
 else
 if(e.getSource() == back) 
 {
 
 { 
 increment =increment - 1; 
 if(increment == 1 || increment == 0) 
 back.setEnabled(false); 
 String TextAreaContent=textarea.getText(); 
 int TextAreaContentLength=TextAreaContent.length(); 
 textarea.replaceText("",0,TextAreaContentLength); 
 forward.setEnabled(true); 
 try 
 { 
 BufferedReader PrevFile = new BufferedReader(new FileReader("UrlHistory\\one"+increment+".html")); 
 while((PrevFileContents=PrevFile.readLine())!= null) 
 { 
 textarea.append(PrevFileContents); 
 } 
 } 
 catch (Exception ex) 
 { 
 } 
 }
 
 //This condition is satisfied whenever the
 //user clicks on the forward button on the user interface
 
 if(e.getSource() == forward) 
 {
 
 back.setEnabled(true); 
 String PrevFilesContentsDeleter=textarea.getText(); 
 int PrevFilesContentsDeleterLength=PrevFilesContentsDeleter.length(); 
 textarea.replaceText("",0,PrevFilesContentsDeleterLength); 
 try 
 { 
 increment = increment+1; 
 BufferedReader NextFile = new BufferedReader(new FileReader("UrlHistory\\one"+increment+".html"));
 while((NextFileContent=NextFile.readLine())!= null) 
 { 
 textarea.append(NextFileContent); 
 } 
 if (increment == count)
 forward.setEnabled(false); 
 }
 catch (Exception ex) 
 { 
 } 
 }
 
 //This condition is satisfied whenever the
 //user clicks on the home button on the interface
 else
 if(e.getSource() == home) 
 {
 
 String ScreenCleaner=textarea.getText(); 
 int ScreenCleanersLength=ScreenCleaner.length(); 
 textarea.replaceText("",0,ScreenCleanersLength); 
 try 
 { 
 int HomePageReaderCount; 
 String HomeIPAddress="127.0.0.1"; 
 HTTP HomePageProtocol=new HTTP(HomeIPAddress); 
 String DefaultFile="\\"; 
 String DefaultFileReaderString; 
 InputStream HomePageReader = HomePageProtocol.get(DefaultFile); 
 OutputStream HomePageSaver=new FileOutputStream("UrlHistory\\one.html"); 
 while((HomePageReaderCount = HomePageReader.read()) != -1) 
 {
 HomePageSaver.write((char)HomePageReaderCount); 
 } 
 BufferedReader HomePageWriter = new BufferedReader(new FileReader("UrlHistory\\one.html")); 
 while((DefaultFileReaderString=HomePageWriter.readLine())!= null) 
 { 
 textarea.append(DefaultFileReaderString); 
 } 
 } 
 catch (Exception s) 
 { 
 ExceptionHandler b = new ExceptionHandler(); 
 b.ServerDown(); 
 } 
 }
 
 //This condition is satisfied whenever the
 //user clicks on the stop button of the interface
 else
 if(e.getSource() == stop) 
 {
 stop.setEnabled(false); 
 thread.stop(); 
 }
 
 //This condition is satisfied whenever the
 //user clicks on the reload button on the interface
 else
 if(e.getSource() == reload) 
 {
 
 url = textfield.getText(); 
 urlLength = url.length(); 
 try 
 { 
 resource=url.substring(0); 
 slash=resource.indexOf('/'); 
 file=resource.substring(slash); 
 host=resource.substring(0,slash); 
 webconnect=new HTTP(host); 
 if(webconnect!=null) 
 { 
 count = count +1; 
 increment = count; 
 forward.setEnabled(false); 
 InputStream TextAreaFileName = webconnect.get(file); 
 OutputStream TextAreaFileNameSaver=new FileOutputStream("UrlHistory\\one"+increment+".html"); 
 while((TextAreaFileNameContent= TextAreaFileName.read()) != -1) 
 { 
 TextAreaFileNameSaver.write((char)TextAreaFileNameContent); 
 } 
 String Blanker=textarea.getText(); 
 int BlankerSize=Blanker.length(); 
 textarea.replaceText("",0,BlankerSize); 
 BufferedReader ReloadReader = new BufferedReader(new FileReader("UrlHistory\\one"+increment+".html")); 
 while((ReloadReaderCount=ReloadReader.readLine())!= null) 
 { 
 back.setEnabled(true); 
 textarea.append(ReloadReaderCount); 
 } 
 } 
 } 
 catch(StringIndexOutOfBoundsException io) 
 {
 ExceptionHandler b = new ExceptionHandler(); 
 b.PutSlash();
 }
 catch(FileNotFoundException r) 
 {
 } 
 catch(UnknownHostException h)
 {
 ExceptionHandler b = new ExceptionHandler();
 b.ServerDown();
 } 
 catch(IOException o)
 {
 ExceptionHandler b = new ExceptionHandler();
 b.ServerDown();
 } 
 }
 
 //This condition is satisfied whenever the
 //the user selects the menuoption open.
 else
 if (e.getSource() == open) 
 {
 
 String Disintegrator=textarea.getText(); 
 String directory; 
 int DisintegratorLength=Disintegrator.length(); 
 textarea.replaceText("",0,DisintegratorLength); 
 Frame OpenFrame=new Frame("open"); 
 FileDialog filedialog=new FileDialog(OpenFrame,"parameter",0); 
 filedialog.show(); 
 directory=filedialog.getDirectory(); 
 FileGoGetter=filedialog.getFile(); 
 try 
 { 
 int FileOnDiskSize; 
 String FileOnDiskReader; 
 InputStream FileOnDisk=new FileInputStream(directory+FileGoGetter); 
 OutputStream FileOnDiskSaver=new FileOutputStream("UrlHistory\\parag.html"); 
 while((FileOnDiskSize = FileOnDisk.read()) != -1) 
 { 
 FileOnDiskSaver.write((char)FileOnDiskSize); 
 } 
 BufferedReader FileOnDiskWriter = new BufferedReader(new FileReader("UrlHistory\\parag.html")); 
 while((FileOnDiskReader = FileOnDiskWriter.readLine())!= null) 
 { 
 textarea.append(FileOnDiskReader); 
 } 
 } 
 catch(IOException io) 
 { 
 } 
 } 
 
 //This condition is satisfied whenever the
 //the user selects the menuoption save.
 else
 if (e.getSource() == save) 
 {
 
 String p=new String(); 
 Frame SaveFrame=new Frame("frames"); 
 FileDialog SaveFileDialog=new FileDialog(SaveFrame,"p",1); 
 SaveFileDialog.show(); 
 String SavedFileName; 
 String SavedFileDirectory; 
 SavedFileDirectory=SaveFileDialog.getDirectory(); 
 SavedFileName=SaveFileDialog.getFile(); 
 try 
 { 
 FileInputStream SavedFileReader=new FileInputStream("UrlHistory\\one"+increment+".html"); 
 FileOutputStream SavedFileWriter=new FileOutputStream(SavedFileDirectory+SavedFileName); 
 while(( SavedFileReaderCount= SavedFileReader.read())!= -1) 
 { 
 SavedFileWriter.write((char)SavedFileReaderCount); 
 } 
 } 
 catch(IOException io) 
 { 
 } 
 } 
 
 //This condition is satisfied whenever the
 //the user selects the menuoption exit.
 else
 if (e.getSource() == exits) 
 {
 
 System.exit(0); 
 } 
 } 
 
 //This method is called whenever the user performs
 //any action on the textfield component.This method starts
 //by finding out the name of the file to be fetched from the server.
 //It then connects to the server and gets the file requested by the user.
 
 
 public void run() 
 { 
 try 
 { 
 resource=url.substring(0); 
 slash=resource.indexOf('/'); 
 file=resource.substring(slash); 
 host=resource.substring(0,slash); 
 webconnect=new HTTP(host); 
 if(webconnect!=null) 
 { 
 count = count +1; 
 increment = count; 
 InputStream WWWFileReader = webconnect.get(file); 
 OutputStream WWWFileWriter=new FileOutputStream("UrlHistory\\one"+increment+".html"); 
 while((TextAreaFileNameContent= WWWFileReader.read()) != -1) 
 { 
 WWWFileWriter.write((char)TextAreaFileNameContent); 
 } 
 BufferedReader WWWScreenWriter = new BufferedReader(new FileReader("UrlHistory\\one"+increment+".html")); 
 String WWWScreenCleaner=textarea.getText(); 
 int WWWScreenCleanerSize=WWWScreenCleaner.length(); 
 textarea.replaceText("",0,WWWScreenCleanerSize); 
 while((ReloadReaderCount=WWWScreenWriter.readLine())!= null) 
 { 
 forward.setEnabled(false); 
 stop.setEnabled(true); 
 reload.setEnabled(true); 
 textarea.append(ReloadReaderCount);
 if(count == 2) 
 back.setEnabled(true); 
 } 
 } 
 } 
 catch(IOException io) 
 { 
 ExceptionHandler b = new ExceptionHandler(); 
 b.ServerDown(); 
 } 
 } 
 //This method is called explicitly to get the homepage
 //from the localhost machine.It connects to the server running
 //on the same machine as this application and gets it's default
 //html file.
 public void HomePage() 
 { 
 if(Eternal == 2) 
 { 
 int OurDefaultFileCount; 
 try 
 { 
 count=1; 
 increment=count; 
 String Ourselves="127.0.0.1"; 
 HTTP OurUrl=new HTTP(Ourselves); 
 String OurDefaultFile="\\"; 
 String DefaultFileStringReader; 
 InputStream OurDefaultFileReader = OurUrl.get(OurDefaultFile); 
 OutputStream OurDefaultFileWriter=new FileOutputStream("UrlHistory\\one"+increment+".html"); 
 while((OurDefaultFileCount= OurDefaultFileReader.read()) != -1) 
 { 
 OurDefaultFileWriter.write((char)OurDefaultFileCount); 
 } 
 BufferedReader DefaultFileScreenWriter = new BufferedReader(new FileReader("UrlHistory\\one"+increment+".html")); 
 while((DefaultFileStringReader=DefaultFileScreenWriter.readLine())!= null) 
 { 
 textarea.append(DefaultFileStringReader); 
 } 
 } 
 catch (Exception e) 
 { 
 ExceptionHandler b = new ExceptionHandler(); 
 b.ServerDown(); 
 } 
 Eternal=3; 
 } 
 } 
 }
 
 
 //This is the class which has the actual code for getting 
 //connected to any server.
 class HTTP 
 { 
 public final static int HTTP_PORT=80; 
 InetAddress wwwserver; 
 DataInputStream FinalReader; 
 PrintStream FinalPrinter; 
 String response;
 //This constructor is called automatically whenever any
 //object of the said class is created. This constructor performs a simple
 //thing.It gets the name of the server machine from which
 //the html file has to be fetched.
 public HTTP(String Server) throws UnknownHostException
 { 
 wwwserver=InetAddress.getByName(Server); 
 } 
 //This method gets the html file from the server. It creates
 //a socket which is then used to get connected to the server
 //machine.Once connected,it makes use of the stream classes 
 //to get the contents of the html file.
 public InputStream get(String filename) throws IOException
 { 
 Socket socket; 
 InputStream InitialReader; 
 OutputStream InitialWriter; 
 socket= new Socket(wwwserver,HTTP_PORT); 
 if(socket==null) 
 { 
 return null; 
 } 
 InitialReader=socket.getInputStream(); 
 InitialWriter=socket.getOutputStream(); 
 FinalReader=new DataInputStream(InitialReader); 
 FinalPrinter=new PrintStream(InitialWriter); 
 if(InitialReader==null || InitialWriter==null) 
 { 
 return null; 
 } 
 FinalPrinter.println("GET " + filename + " HTTP/1.0\n"); 
 while((response=FinalReader.readLine()).length() > 0) 
 { 
 if(response.startsWith("HTTP/1.0 404 Not Found")) 
 { 
 ExceptionHandler ErrorFile=new ExceptionHandler(); 
 ErrorFile.FileNotFound(); 
 } 
 } 
 return FinalReader; 
 } 
 } 
 //This class declares the functions which implement native code
 //These functions are called whenever an exception occurs and a
 //MessageBox with an appropriate error message is displayed.
 class ExceptionHandler
 { 
 public native void ServerDown();
 public native void FileNotFound();
 public native void PutSlash();
 //This constructor loads the new.dll which contains
 //the actual code for the above mentioned functions. 
 public ExceptionHandler()
 { 
 System.loadLibrary("new"); 
 } 
 }