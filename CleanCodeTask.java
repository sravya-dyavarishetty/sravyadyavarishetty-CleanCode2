package EpamTask4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CleanCodeTask {

			static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
			public static void cleancode(double pr,double rate,double time)throws Exception {
				// TODO Auto-generated constructor stub
				double sim=simpleInterest(pr,rate,time);
				double com=compoundInterest(pr,rate,time);
				System.out.println("Simple Interest = "+sim+"\n");;
				System.out.println("Compound Interest = "+com+"\n");
			}
			public static double simpleInterest(double price,double rate,double time)
			{
				return((price*rate*time)/100.0);
			}
			public static double compoundInterest(double price,double rate,double time)
			{
				double x=price*Math.pow(1.0+(rate/100.0),time)-price;
				return x;
			}
			public static void main(String[] args)throws Exception{
				// TODO Auto-generated method stub
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter price");
				bw.write("Enter price \n");
				double price=Double.parseDouble(br.readLine());
				bw.write("Enter rate of interest \n");
				double rateofInterest=Double.parseDouble(br.readLine());
				bw.write("Enter time \n");
				double time=Double.parseDouble(br.readLine());
				cleancode(price,rateofInterest,time);
				bw.flush();
			}
		//bw.flush();
	}
