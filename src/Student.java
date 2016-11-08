

public class Student {
	static String name;
	static String sex;
	public void member(String Name,String Sex){
		this.name=Name;
		this.sex=Sex;
	}
	static void printstudent(){
		System.out.println(""+sex);
		System.out.println("");
		System.out.println("=============================================");
	}
	
	static class SubjectType{
		String typeName;
		int attenRatio1;
		int assignRatio1;
		int labRatio1;
		int finalRatio1;
		double attenRatio;
		static final double assignRatio=0.1;
		static final double labRatio=0.1;
		double finalRatio;
		void setRatio(String typeName,int attenRatio1,int assignRatio1,int labRatio1,int finalRatio1){
			this.typeName=typeName;
			this.assignRatio1=assignRatio1;
			this.attenRatio1=attenRatio1;
			this.labRatio1=labRatio1;
			this.finalRatio1=finalRatio1;
		}

		void printlnfo(String Name){
			String name1;
			name1=Name;
			
			class CaleScore{
				double result;
				public double caleScore1(){
					attenRatio=0.1;
					finalRatio=0.7;
					return result=attenRatio1*attenRatio+assignRatio1*assignRatio+labRatio1*labRatio+finalRatio1*finalRatio;
					
				}
				public double caleScore2(){
					attenRatio=0.2;
					finalRatio=0.6;
					return result=attenRatio1*attenRatio+assignRatio1*assignRatio+labRatio1*labRatio+finalRatio1*finalRatio;
					
				}
			}
			CaleScore ca=new CaleScore();
			
			
			
			if(typeName=="")
			{
				System.out.println(name1+"   "+typeName+"          "+attenRatio1+"     "+assignRatio1+"     "+labRatio1+"     "+finalRatio1+"     "+(int)ca.caleScore2());
			}
			else
			{
				System.out.println(name1+"    "+typeName+"          "+attenRatio1+"     "+assignRatio1+"     "+labRatio1+"     "+finalRatio1+"     "+(int)ca.caleScore1());
			}
			
			
		}
		
	}

	
	
	
}
	


