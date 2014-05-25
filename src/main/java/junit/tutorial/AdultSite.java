// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial;

public class AdultSite {

    public static boolean canRegister(int age) {
        return 18 <= age;
    }
    
    /**
     * 優待会員かどうかを返す.
     * @param age 年齢
     * @param isRegisterMailMagazine メールマガジンに登録している場合にtrue
     * @param usePastMonth 
     * @return
     */
    public static boolean isSpecialMember(int age, boolean isRegisterMailMagazine, int usePastMonth) {
        if(age < 20) {
            return false;
        }
        if (!isRegisterMailMagazine) {
            return false;
        }
        if (usePastMonth < 1) {
            return false;
        }
        return true;
    }
}
