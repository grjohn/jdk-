package newcoder_15;

public class 数值的整数次方_12 {
	public double Power(double base, int exponent) {
        if(exponent==1) return base;
        if(exponent==0) return 1;
        int i=1;
        int flag=exponent>0?1:0;
        double beforenum=base;
        exponent=Math.abs(exponent);
        int beforeex = exponent;
        
        if(exponent>i){
            base=base*base;
            i=i+i;
        }
        return flag>0?(base*Power(beforenum,beforeex-i)):1/(base*Power(beforenum,beforeex-i));
  }
}
