public class banka {
    
private double hesapNo;
private double hesaptakiPara;
public static int hesapSayisi;
public static int yatirmaSayisi;
public static int cekilmeSayisi;

public banka(double hesaptakiPara){
    this.hesaptakiPara=hesaptakiPara;
}

    public double getHesapNo() {
        return this.hesapNo;
    }

    public void setHesapNo(double hesapNo) {
        this.hesapNo = hesapNo;
        hesapSayisi++;
    }

    public double getHesaptakiPara() {
        return this.hesaptakiPara;
    }

    public void setHesaptakiPara(double hesaptakiPara) {
        this.hesaptakiPara = hesaptakiPara;
    }

    public double ParaYatirma(double yatirilan){

        this.hesaptakiPara=this.hesaptakiPara+yatirilan;
        yatirmaSayisi++;
        return this.hesaptakiPara;
        

    }
     public double ParaCekme(double cekilen){

        this.hesaptakiPara=this.hesaptakiPara-cekilen;
        cekilmeSayisi++;
        return this.hesaptakiPara;

    }

    public void bakiyeGoster(){
        System.out.println("Güncel Bakiyeniz: "+ hesaptakiPara);
    }
    public void IslemSayisi(){
        System.out.println(yatirmaSayisi + " tane para yatırma işlemi ve " + cekilmeSayisi + " tane para çekilme işlemi yapılmıştır." );
    }
    public static void karsilastirma(banka b1, banka b2){
        if(b1.getHesaptakiPara()<b2.getHesaptakiPara()){
            System.out.println(b2.getHesapNo() + " hesap nolu kullanıcının parası " + b1.getHesapNo() + " hesap nolu kullanıcının parasından fazladır.");
        }else if(b1.getHesaptakiPara()==b2.getHesaptakiPara()){
             System.out.println(b1.getHesapNo() + " hesap nolu kullanıcının parası " + b2.getHesapNo() + " hesap nolu kullanıcının parasından eşittir.");
        }
        else{
             System.out.println(b1.getHesapNo() + " hesap nolu kullanıcının parası " + b2.getHesapNo() + " hesap nolu kullanıcının parasından fazladır.");
        }
    }

}