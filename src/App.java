public class App {
    public static void main(String[] args) throws Exception {
        banka b1=new banka(13000);
        banka b2=new banka(2000);
        banka b3=new banka(500);

        b1.setHesapNo(231);
        b2.setHesapNo(35);
        b3.setHesapNo(554);
        
        System.out.println("Bankadaki hesap sayısı: "+ banka.hesapSayisi);

        b1.ParaCekme(500);
     
        b1.ParaCekme(400);
      
       b1.ParaCekme(5200);
       b2.ParaYatirma(780);
       b2.ParaYatirma(850);
       b2.ParaYatirma(70);
       b1.bakiyeGoster();
       b2.bakiyeGoster();;

       System.out.println("bankadan para çekilme sayısı: "+ banka.cekilmeSayisi);
       System.out.println("bankaya para yatırma sayısı: "+ banka.yatirmaSayisi);
      
       banka.karsilastirma(b1, b2);
       

    }
    
}