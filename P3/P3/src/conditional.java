public class conditional {
    public static void main(String[] args) {

        int nilai =80;
        int absensi = 75;

        // IF Statement
        if (nilai >= 80 && absensi >= 80) {
            System.out.println("Anda Lulus....!!");
        } else{
            System.out.println("Anda Tidak Lulus...!! ");
        }

        // Else if statement and nested condition
        if (absensi >= 75) {
            if (nilai >= 90) {
                System.out.println("Nilai A");
            }else if (nilai >= 80) {
                System.out.println("Nilai B");
            }else if (nilai >= 70) {
                System.out.println("Nilai C");
            }else if (nilai >= 60) {
                System.out.println("Nilai D");
            }else{
                System.out.println("Anda tidak Lulus .....!!!");
            }
        } else{
            System.out.println("Anda tidak Lulus .....!!!");
        }

        // Switch Condition 
        switch (nilai) {
            case 90:
                System.out.println("Nilai A");
                break;
            case 80:
                System.out.println("Nilai B");
                break;
            default:
                System.out.println("Tidak Lulus");
                break;
        }

    }
}
