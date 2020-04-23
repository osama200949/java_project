import javax.swing.*;
import java.util.Scanner;

class Subject
{
   private String code, name, grade;
   private int credit;
   static int totalCredit = 0;

   public Subject (String code, String name, int credit, String grade)
   {
	   this.code = code;
	   this.name = name;
	   this.credit = credit;
	   this.grade = grade;
	   totalCredit += credit;
   }

   public String getCode()
   {
	   return code;
   }

   public String getName()
   {
	   return name;
   }

   public String getGrade()
   {
	   return grade;
   }

   public int getCredit()
   {
	   return credit;
   }
}


public class Test1 {
	static public double getGradeValue(String grade) {
		if (grade.equals("A"))
			return 4.0;
		else if (grade.equals("B") )
			return 3.0;
		else if (grade.equals("C"))
			return 2.0;
		else if (grade.equals("D"))
			return 1.0;
		else
			return 0.0;
	}

	public static void main(String[] args) {



			String studName, numSubj, codeSubj, nameSubj, grade, creditStr;
			int numSubject, credit;
			float totalValue = 0;

			Scanner inp = new Scanner(System.in);

			studName = JOptionPane.showInputDialog("Enter your name");
			numSubj = JOptionPane.showInputDialog("The number of subject taken");
			JOptionPane.showMessageDialog(null,
					studName + " takes " + numSubj + " subject(s)",
					"Subject Info", JOptionPane.INFORMATION_MESSAGE);


			numSubject = Integer.parseInt(numSubj);
			Subject[] subj = new Subject[numSubject];
			System.out.println("Please enter the data for your subject: ");

			for (int i = 0; i < numSubject; i++) {
				System.out.println("\nSubject[" + (i + 1) + "]");
				System.out.print("\tCode  : ");
				codeSubj = inp.nextLine();
				System.out.print("\tName  : ");
				nameSubj = inp.nextLine();
				System.out.print("\tCredit: ");
				creditStr = inp.nextLine();
				credit = Integer.parseInt(creditStr);
				System.out.print("\tGrade : ");
				grade = inp.nextLine().toUpperCase();
				subj[i] = new Subject(codeSubj, nameSubj, credit, grade);
			}


			System.out.println("\n\n\nRESULT FOR SEM 2, 2017/2018");
			System.out.println("\nNAME: " + studName.toUpperCase());
			for (int i = 0; i < numSubject; i++) {
				System.out.printf("\n%-5d%-12s%-35s%-5s%.2f", i + 1, subj[i].getCode(),
						subj[i].getName(), subj[i].getGrade(), getGradeValue(subj[i].getGrade()));
				totalValue += getGradeValue(subj[i].getGrade()) * subj[i].getCredit();
			}
			System.out.println("\n\nTOTAL CREDITS = " + Subject.totalCredit);
			System.out.printf("YOUR GPA      = %.2f%n%n", (totalValue / Subject.totalCredit));
		}
	}

