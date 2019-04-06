public class Principal {

    public static void main(String[] args) {

        Filho filho01 = new Filho();
        Filho filho02 = new Filho();

        filho01.setMae("Maria");
        filho02.setMae("Nina");

        filho01.setPai("Joaquim");
        filho02.setPai("Claudio");

        System.out.println("Tem a mesma mãe: " + temAmesmaMae(filho01, filho02));
        System.out.println("Tem o mesmo pai: " + temOmesmoPai(filho01, filho02));
        System.out.println("São meio irmãos: " + saoMeioIrmaos(filho01, filho02));
    }

    public static String maeDe(Filho filho) {

        return filho.getMae();
    }

    public static String paiDe(Filho filho) {

        return filho.getPai();
    }

    public static Boolean temAmesmaMae(Filho filho01, Filho filho2) {

        return maeDe(filho01) == maeDe(filho2);
    }

    public static Boolean temOmesmoPai(Filho filho01, Filho filho2) {

        return paiDe(filho01) == paiDe(filho2);
    }

    public static Boolean saoMeioIrmaos(Filho filho01, Filho filho2) {

        return (!temAmesmaMae(filho01, filho2) && temOmesmoPai(filho01, filho2)) ||
                (temAmesmaMae(filho01, filho2) && !temOmesmoPai(filho01, filho2));
    }
}