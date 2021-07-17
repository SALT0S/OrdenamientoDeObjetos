public class Telefono {
    public static void main(String[] args) throws Exception {
        // mostramos el arreglo
        System.out.println("Arreglo sin orden:");
        for (Telefonos t : telefonos) {
            System.out.println(t);
        }
        System.out.println("\n");

        System.out.println("En orden alfabetico:");
        ordInscNameAlfa(telefonos);
        for (Telefonos t : telefonos) {
            System.out.println(t);
        }
        System.out.println("\n");

        System.out.println("En orden de marca:");
        ordInscMarcaAlfa(telefonos);
        for (Telefonos t : telefonos) {
            System.out.println(t);
        }

        System.out.println("\n");

        System.out.println("Segun la ram en orden ascendente:");
        ordInscAgeAsc(telefonos);
        for (Telefonos t : telefonos) {
            System.out.println(t);
        }

        System.out.println("\n");

    }

    private static Telefonos[] telefonos = { new Telefonos(8, "Galaxy S21", "Samsung"),
            new Telefonos(6, "Iphone 7", "Apple"), new Telefonos(6, "Redmi Note 8", "Xiaomi"),
            new Telefonos(2, "P Smart Pro", "Huawei"), new Telefonos(2, "Legion Duel", "Lenovo"),
            new Telefonos(4, "LG K51S   ", "LG"), new Telefonos(6, "Xperia X", "Sony"),
            new Telefonos(4, "Nokia 808", "Nokia"), new Telefonos(4, "Lumia 510", "Microsoft"),
            new Telefonos(2, "moto g20", "Motorola"), new Telefonos(2, "HTC Desire 20+", "HTC"),
            new Telefonos(4, "BlackBerry Q10", "Blackberry"), new Telefonos(4, "Blade V8 Mini", "ZTE"),
            new Telefonos(4, "Iphone 7", "Apple"), new Telefonos(2, "Meizu 17 Pro", "Meizu"),
            new Telefonos(6, "Ilium M9", "Lanix"), new Telefonos(2, "Reno5 Lite", "Oppo"),
            new Telefonos(8, "Iphone 10", "Apple"), new Telefonos(16, "Zenfone 3 Ultra", "Asus"),
            new Telefonos(2, "Iphone 6", "Apple"), };

    private static void ordInscNameAlfa(Telefonos[] arreglo) {
        int in;

        for (int i = 1; i < arreglo.length; i++) {
            Telefonos aux = arreglo[i];
            in = i; // inicia el desplazamiento en i

            while (in > 0 && arreglo[in - 1].getModelo().compareTo(aux.getModelo()) > 0) {
                arreglo[in] = arreglo[in - 1]; // desplaza el elemento hacia la derecha
                --in;
            }

            arreglo[in] = aux; // inserta elemento
        }
    }

    private static void ordInscMarcaAlfa(Telefonos[] arreglo) {
        int in;

        for (int i = 1; i < arreglo.length; i++) {
            Telefonos aux = arreglo[i];
            in = i; // inicia el desplazamiento en i

            while (in > 0 && arreglo[in - 1].getMarca().compareTo(aux.getMarca()) > 0) {
                arreglo[in] = arreglo[in - 1]; // desplaza el elemento hacia la derecha
                --in;
            }

            arreglo[in] = aux; // inserta elemento
        }
    }

    static void ordInscAgeAsc(Telefonos[] arreglo) {
        int in;

        for (int i = 1; i < arreglo.length; i++) {
            Telefonos aux = arreglo[i];
            in = i; // inicia el desplazamiento en i

            while (in > 0 && arreglo[in - 1].getRam() > aux.getRam()) {
                arreglo[in] = arreglo[in - 1]; // desplaza el elemento hacia la derecha
                --in;
            }

            arreglo[in] = aux; // inserta elemento
        }
    }

}

class Telefonos {
    private int ram;
    private String modelo;
    private String marca;

    public Telefonos(int ram, String modelo, String marca) {
        this.ram = ram;
        this.modelo = modelo;
        this.marca = marca;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "\t" + modelo + "\t - \t" + ram + "\t - \t" + marca;
    }

}
