import java.awt.Graphics2D;
import java.awt.Color;
public class SerpienteX{
	Color color;
	int dir,partes[][],yo,px,py,uarea;
	String nombre;
	SerpienteX enemigo;
	boolean muerto,pc,cambio,separado;
	final static int w=10;
	SerpienteX(int x,int y,int d,Color c,Sneics s,int yoo){
		partes=new int[600/w][600/w];
		dir=d;
		color=c;
		muerto=false;
		yo=yoo;
		partes[x/w][y/w]=yo;
		px=x;
		py=y;
	}
	public void setPc(boolean b){
		pc=b;
	}
	public void setOtro(SerpienteX enem){
		enemigo=enem;
	}
	public void actualizar(){
		if(pc)mover();
		if(dir==0)px+=w;
		else if(dir==1)py+=w;
		else if(dir==2)px-=w;
		else if(dir==3)py-=w;
		if(colision(px,py)){
			muerto=true;
			return;
		}
		partes[px/w][py/w]=yo;
	}
	public boolean colision(int tx,int ty){
		if(tx<0||ty<0||tx>600-w||ty>600-w)return true;
		return partes[tx/w][ty/w]!=0||enemigo.partes[tx/w][ty/w]!=0;
	}
	protected void mover(){
		int ndir=direccion();
		int tx=px,ty=py;
		if(!separado)
			separado=verificar();
		if(dir==0)tx+=w;
		else if(dir==1)ty+=w;
		else if(dir==2)tx-=w;
		else if(dir==3)ty-=w;
		if(colision(tx,ty)||(Math.random()*100>90&&!separado)||uarea-10>area(tx,ty)||cambio)dir=ndir!=-1?ndir:dir;
		cambio=false;
	}
	public boolean verificar(){
		int matriz[][]=obtenerMatriz();
		matriz[px/w][py/w]=0;
		return verificar(matriz,px,py,enemigo.px,enemigo.py);
	}
	public boolean verificar(int matriz[][],int ox,int oy,int dx,int dy){
		if(ox==dx&&oy==dy)return false;
		if(areaColision(ox,oy,matriz))return true;
		matriz[ox/w][oy/w]=yo;
		return verificar(matriz,ox+w,oy,dx,dy)&&verificar(matriz,ox-w,oy,dx,dy)&&verificar(matriz,ox,oy+w,dx,dy)&&verificar(matriz,ox,oy-w,dx,dy);
	}
	public int direccion(){
		int areae=areaE(-1,-1,obtenerMatriz(),enemigo);
		int lista[]=new int[4],val[]=new int[4],nueva[]=new int[4],act2=0,act=0,ndir=-1;
		if(!colision(px+w,py)){
			lista[act]=0;
			act++;
		}
		if(!colision(px,py+w)){
			lista[act]=1;
			act++;
		}
		if(!colision(px-w,py)){
			lista[act]=2;
			act++;
		}
		if(!colision(px,py-w)){
			lista[act]=3;
			act++;
		}
		int tx,ty,vx,vy,cuenta;
		for(int i=0;i<act;i++){
			tx=px;
			ty=py;
			vx=vy=0;
			cuenta=0;
			if(lista[i]==0)vx=w;
			else if(lista[i]==1)vy=w;
			else if(lista[i]==2)vx=-w;
			else if(lista[i]==3)vy=-w;
			tx+=vx;
			ty+=vy;
			val[i]=area(tx,ty);
			for(int ti=tx/w-1;ti<=tx/w+1;ti++)
				for(int tj=ty/w-1;tj<=ty/w+1;tj++)
					if(!colision(tx,ty))cuenta++;
			val[i]+=cuenta;
			int matrizT[][]=obtenerMatriz();
			int tmArea;
			while(!colision(tx,ty)){
				matrizT[tx/w][ty/w]=yo;
				tx+=vx;
				ty+=vy;
			}
			try{
				matrizT[tx/w][ty/w]=yo;
			}catch(Exception ex){}
			tmArea=areaE(-1,-1,matrizT,enemigo);
			if(tmArea<areae/2){
				val[i]+=50;
				cambio=true;
			}
			
			if(cuenta<2)if(lista[i]==dir)cambio=true;
		}
		int mayor=-1;
		for(int i=0;i<act;i++){
			if(act==0){
				mayor=val[i];
				nueva[act2]=lista[i];
				continue;
			}
			if(val[i]>mayor){
				act2=0;
				nueva[act2]=lista[i];
				mayor=val[i];
			}
			else if(val[i]==mayor){
				act2++;
				nueva[act2]=lista[i];
			}
		}
		if(act>0){
			uarea=mayor;
			ndir=nueva[(int)(Math.random()*(act2+1))];
		}
		return ndir;
	}
	public void pintar(Graphics2D g){
		for(int i=0;i<partes.length;i++)
			for(int j=0;j<partes[i].length;j++)
				if(partes[i][j]==yo){
					g.setColor(i*w==px&&j*w==py?Color.GREEN:color);
					g.fillRect(i*w,j*w,w,w);
				}
	}
	protected int length(){
		int tam=0;
		for(int i=0;i<partes.length;i++)
			for(int j=0;j<partes[i].length;j++)
				if(partes[i][j]==yo)tam++;
		return tam;
	}
	protected int[][] obtenerMatriz(){
		int matriz[][]=new int[partes.length][partes[0].length],i,j;
		for(i=0;i<partes.length;i++)
			for(j=0;j<partes[i].length;j++)
				matriz[i][j]=partes[i][j]!=0?partes[i][j]:enemigo.partes[i][j];
		return matriz;
	}
	protected int areaE(int tx,int ty,int matriz[][],SerpienteX dest){
		if(dest.px<0||dest.py<0||dest.px>600-w||dest.py>600-w)return 0;
		matriz[dest.px/w][dest.py/w]=0;
		if(tx!=-1&&ty!=-1)matriz[tx/w][ty/w]=yo;
		return area(dest.px,dest.py,matriz,0);
	}
	protected int area(int tx,int ty){
		int matriz[][]=obtenerMatriz();
		return area(tx,ty,matriz,0);
	}
	protected int area(int tx,int ty,int matriz[][],int area){
		if(areaColision(tx,ty,matriz))return area;
		matriz[tx/w][ty/w]=yo;
		area++;
		area=area(tx+w,ty,matriz,area);
		area=area(tx-w,ty,matriz,area);
		area=area(tx,ty+w,matriz,area);
		area=area(tx,ty-w,matriz,area);
		return area;
	}
	protected boolean areaColision(int tx,int ty,int matriz[][]){
		if(tx<0||ty<0||tx>600-w||ty>600-w)return true;
		return matriz[tx/w][ty/w]!=0;
	}
}
