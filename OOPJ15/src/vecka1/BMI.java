package vecka1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BMI {

	private void read() {
		int i = 2;
		int j = 0;
		int weight, height, age;
		float BMI = 0;
		String line = null;
		String line2 = null;
		String temp = "";
		String end = "";

		try (BufferedReader br = new BufferedReader(
				new FileReader("C:/Users/borgs_000/workspace/OOPJ15/text/bmi.txt"))) {
			while (temp != null) {
				j++;
				BMI = 0;
				temp = br.readLine();
				if (j % 2 == 0) {
					line2 = temp;
					@SuppressWarnings("resource")
					Scanner scanner = new Scanner(line2);
					age = scanner.nextInt();
					height = scanner.nextInt();
					weight = scanner.nextInt();
					BMI = calculateBMI(height, weight);
				
					if (BMI >= 30) {
						line2 = Float.toString(BMI);
						end +=line +" " +line2 +'\n';
						writeToFile(end);
					}

				} else {
					line = temp;
				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private float calculateBMI(int lenght, int weight) {
		return (float) weight/(lenght * lenght)*10000;
	}

	private void writeToFile(String line) {
		try (BufferedWriter bw = new BufferedWriter(
				new FileWriter("C:/Users/borgs_000/workspace/OOPJ15/text/bmiSvar.txt"))) {
			bw.write(line );
			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void control()
	{
		try (BufferedReader br = new BufferedReader(
				new FileReader("C:/Users/borgs_000/workspace/OOPJ15/text/bmiSvar.txt"))){
			String s = br.readLine();
			System.out.println(s);
			s = br.readLine();
			System.out.println(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		BMI bmi = new BMI();

		bmi.read();
		bmi.control();

	}

}
