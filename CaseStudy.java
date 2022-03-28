package casestudy;
	public class CaseStudy {
		abstract class Item {
			private int idNum;
			private String title;
			private int numCop;
			//Here we use getters and setters concept
			public int getIdNum() {
				return idNum;
			}
			public void setIdNum(int idNum) {
				this.idNum = idNum;
			}
			public String getTitle() {
				return title;
			}
			public void setTitle(String title) {
				this.title = title;
			}
			public int getNumCop() {
				return numCop;
			}
			public void setNumCop(int numCop) {
				this.numCop = numCop;
			}
			//Using toString method
			@Override
			public String toString() {
				return "Item [idNum=" + idNum + ", title=" + title + ", numCop=" + numCop + "]";
			}
			//Here we use one method for printing title and number of copies
			public void print() {
				System.out.println("Title:"+title);
				System.out.println("Item Number"+idNum);
				System.out.println("Number of Copies"+numCop);
			}
		}
		//creating abstract class and extends item from using upper item class
		abstract class WrittenItem extends Item {
			private String authorName;

			public String getAuthorName() {
				return authorName;
			}

			public void setAuthorName(String authorName) {
				this.authorName = authorName;
			}

		}
		class Book extends WrittenItem {

		}
		class JournalPaper extends WrittenItem {
			private int yearOfPub;

		}
		//Creating  abstract class of media item for media 
		abstract class MediaItem {
			private int runTime;
			//Here use getter and setters
			public int getRunTime() {
				return runTime;
			}

			public void setRunTime(int runTime) {
				this.runTime = runTime;
			}
			//Here use toString method
			@Override
			public String toString() {
				return "MediaItem [runTime=" + runTime + "]";
			}

		}
		//Here we extends  all the properties which we define in MediaItem in video class
		class Video extends MediaItem {
			private String dirName;
			private String genre;
			private int yearOfRel;
			//Here We Use Getters and setters
			public void idNum(int i) {
				// TODO Auto-generated method stub

			}
			public void setIdNum(int i) {
				// TODO Auto-generated method stub

			}
			public void setTitle(String string) {
				// TODO Auto-generated method stub

			}
			public void setNumCop(int i) {
				// TODO Auto-generated method stub

			}
		}
		//Here also we extends All the method of mediaItem in CD class
		class CD extends MediaItem {
			private String artist;
			private String genre;
			//Here we use getter and setter
			public void setIdNum(int i) {
				// TODO Auto-generated method stub

			}
			public void setTitle(String string) {
				// TODO Auto-generated method stub

			}
			public void setNumCop(int i) {
				// TODO Auto-generated method stub

			}
		}
		//here is MAIN method where we create all the object of class which we want and method
		public static void main(String[] args) {
			//Creating Object of case study
			CaseStudy cl=new CaseStudy(); 
			//Creating Object of Book class using case study class
			Book b=cl.new Book();	
			//Here Creating Object of JournalPaper suing CaseStudy class
			JournalPaper j=cl.new JournalPaper();	
			
			//Creating Video class object using caseStudy 
			Video v=cl.new Video();
			
			//Creating CD class Object Using CaseStudy class
			CD c=cl.new CD();
			
			//Setting All the  things like author name title and numCopies using Book object
			b.setAuthorName("Amrita pritam");
			b.setTitle("The Skeleton and that man");
			b.setNumCop(5);
			System.out.println("book 1 author :"+b.getAuthorName()+" "+b.getTitle()+" "+b.getNumCop());
			System.out.println(b.toString());//using object use toString Method
			System.out.println("---------------------------------");
			j.setAuthorName("Chetan bhagat");
			j.yearOfPub=2019;
			j.setTitle("India Positive");
			j.setNumCop(1000);
			System.out.println("Journal 1 :"+j.getAuthorName());
			System.out.println("Year of publication :"+j.yearOfPub);
			System.out.println(j.toString());
			System.out.println("----------------------------------");
			//Seting all the things in video class like dirName etc
			
			v.dirName="Aditya Dhara";
			v.genre="hosr";
			v.yearOfRel=2019;
			v.setRunTime(3);
			v.setIdNum(115);
			v.setTitle("URI");
			v.setNumCop(10);
			//Printing All the things here
			System.out.println("Director: "+v.dirName);
			System.out.println("Genre: "+v.genre);
			System.out.println("Year of Release: "+v.yearOfRel);
			System.out.println("Runtime:"+v.getRunTime());
			System.out.println(v.toString());
			System.out.println("----------------------------------");
			//Here Also we setting all like artist
			c.artist="Diljit";
			c.genre="Punjabi";
			c.setIdNum(101);
			c.setTitle("Dope");
			c.setNumCop(10);
			c.setRunTime(5);
			System.out.println("Artist:"+c.artist);
			System.out.println("Genre:"+c.genre);
			System.out.println("Runtime:"+c.getRunTime());




		}

	}

