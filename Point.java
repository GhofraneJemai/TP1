public class Point
{
	private String Nom;
	private int abscisse;
	private int ordonnée;
public Point(String n,int a,int o)
{
	abscisse = a;
	ordonnée = o;
	Nom = n;
}
public Point(String m)
{
	Nom = m;
}
public Point(int a,int o)
{
	abscisse = a;
	ordonnée = o;
}
public void Affiche() 
{
    System.out.println(Nom + "(" + abscisse + ", "+ ordonnée+")");
}
public void TranslHoriz(int trans) 
{
    abscisse += trans;
}
public void TranslVert(int trans) {
    ordonnée += trans;
}
public void Translation(int a, int b){
	abscisse += a;
	ordonnée += b;
	
}
public void setNom(String n){
	this.Nom = n ;
}
public void setAbscisse(int x){
	this.abscisse = x;
}
public void setOrdonnee(int x){
	this.ordonnée = x;
}
public String getNom(){
	return Nom ;
}
public int getAbscisse() {
	return abscisse;
}
public int getOrdonnee() {
	return ordonnée;
}
}