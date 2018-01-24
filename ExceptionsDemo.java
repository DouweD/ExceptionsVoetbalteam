//NOTE: SCISKILL IS DE WAARDE DIE WE BIJ HET BEDRIJF WAAR IK AFGELOPEN JAAR (SCISPORTS) AAN SPELERS GAVEN OP BASIS VAN DATA


class voetbalteam{

	Opstelling [] spelers = new Opstelling[11];
	int gemiddeldeSciSkill;

	void gemiddeldeSciSkill(Opstelling x) throws Exception {
					int gemiddeldeSciSkill=this.gemiddeldeSciSkill;
					if (gemiddeldeSciSkill==0) {throw new Exception();}
					else {
					gemiddeldeSciSkill += x.SciSkill;
					System.out.println(x.SciSkill);
					System.out.println("gemiddelde SciSkill is: "+ gemiddeldeSciSkill);
		}
					
			}
	int berekenSciSkill(Opstelling speler) throws Exception {
		if (speler.SciSkill==0) {
			throw new Exception();
		}
		else { 
			return speler.SciSkill;
		}
	}
	
	}


class Opstelling{
	String naam;
	int SciSkill;
	Opstelling(String naam, int SciSkill) {
		this.naam= naam;
		this.SciSkill=SciSkill;
	}
	
}


public class ExceptionsDemo {

	public static void main(String []args) {
		Opstelling onana = new Opstelling("André Onana", 70);
		Opstelling tagliafico = new Opstelling("Nicolas Tagliafico", 56);
		Opstelling deligt = new Opstelling("Matthijs de Ligt", 77);
		Opstelling wober = new Opstelling("Maximillian Wöber", 70);
		Opstelling nissen = new Opstelling("Rasmus Nissen Kristensen", 56);
		Opstelling dejong = new Opstelling("Frenkie de Jong", 77);
		/* Opstelling vandebeek = new Opstelling("Donny van de Beek", 70);
		Opstelling eiting = new Opstelling("Carel Eiting", 56);
		Opstelling kluivert = new Opstelling("Justin Kluivert", 77);
		Opstelling dolberg = new Opstelling("Kasper Dolberg", 70);
		Opstelling neres = new Opstelling("David Neres", 56);*/
		
		voetbalteam voetbalteam = new voetbalteam();
		voetbalteam.spelers[0]=onana;
		voetbalteam.spelers[1]=tagliafico;
		voetbalteam.spelers[2]=deligt;
		voetbalteam.spelers[3]=wober;
		voetbalteam.spelers[4]=nissen;
		voetbalteam.spelers[5]=dejong;
		/*voetbalteam.spelers[6]=vandebeek;
		voetbalteam.spelers[7]=eiting;
		voetbalteam.spelers[8]=kluivert;
		voetbalteam.spelers[9]=dolberg;
		voetbalteam.spelers[10]=neres;*/
		for (Opstelling x: voetbalteam.spelers) {
		try { 
			voetbalteam.gemiddeldeSciSkill(x);
		}
		catch (Exception e) {
			System.out.println(" nog niet alle SciSkills zijn binnen" );
		}
	}
}
}