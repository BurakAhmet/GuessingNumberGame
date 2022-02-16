import java.util.*;
public class GuessingNumber {

	public static void main(String[] args) {
		
		System.out.print("Rastgele oluşturulan 0-100 arasındaki sayıyı tahmin ediniz \nTahmininizi giriniz: ");
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*99+1);
		int guess,pcGuess,counter=0;
		while(true)
		{
			counter++;
			while(!sc.hasNextInt())
			{
				System.out.println("Lütfen sadece tamsayı kullanın!");
				sc.next();
			}
			guess = sc.nextInt();
			while(guess>99 || guess<=0)
			{
				System.out.println("Lütfen sadece 0-100 arasında bir sayı giriniz!");
				while(!sc.hasNextInt())
				{
					System.out.println("Lütfen sadece tamsayı kullanın!");
					sc.next();
				}
				guess=sc.nextInt();
			}
			if(guess>answer)
			{
				System.out.println("Tahmininiz çok büyük.");
				System.out.print("Bilgisayar tahmin ediyor");
				pcGuess= (int)(Math.random()*(guess+1)+1);
				if(pcGuess>answer)
				{
					System.out.printf("\nBilgisayarın tahmini %d ve bu çok büyük.\nTahmininizi giriniz: ",pcGuess);
				}
				if(pcGuess<answer)
				{
					System.out.printf("\nBilgisayarın tahmini %d ve bu çok küçük.\nTahmininizi giriniz: ",pcGuess);
				}
				if(pcGuess==answer)
				{
					System.out.printf("\nBilgisayarın tahmini %d.\nCevap %d'idi bilgisayar kazandı!",answer,answer);
					break;
				}
			}
			if(guess<answer)
			{
				System.out.println("Tahmininiz çok küçük.");
				System.out.print("Bilgisayar tahmin ediyor");
				pcGuess= (int)(Math.random()*(100-guess)+guess);
				if(pcGuess>answer)
				{
					System.out.printf("\nBilgisayarın tahmini %d ve bu çok büyük.\nTahmininizi giriniz: ",pcGuess);
				}
				if(pcGuess<answer)
				{
					System.out.printf("\nBilgisayarın tahmini %d ve bu çok küçük.\nTahmininizi giriniz: ",pcGuess);
				}
				if(pcGuess==answer)
				{
					System.out.printf("\nBilgisayarın tahmini %d.\nCevap %d'idi bilgisayar kazandı!",answer,answer);
					break;
				}
			}
			if(guess==answer)
			{
				System.out.printf("Tebrikler cevap %d'idi %d. tahmininizde siz kazandınız!",answer,counter);
				break;
			}
			
		}
		sc.close();
		
	}
	
}
