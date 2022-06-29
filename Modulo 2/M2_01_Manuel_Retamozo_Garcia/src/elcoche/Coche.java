package elcoche;

public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private int velocidadMaxima;
    private Chasis chasis;
    private Rueda rueda;

    public Coche(String matricula, String marca, String modelo, int potencia, int velocidadMaxima) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Coche(String matricula, String marca, String modelo, int potencia, int velocidadMaxima, Coche.Chasis chasis,
            Coche.Rueda rueda) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.velocidadMaxima = velocidadMaxima;
        this.chasis = chasis;
        this.rueda = rueda;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Rueda getRueda() {
        return rueda;
    }

    public void setRueda(Rueda rueda) {
        this.rueda = rueda;
    }

    class Chasis {
        private String material;
        private int peso;

        public Chasis(String material, int peso) {
            this.material = material;
            this.peso = peso;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public int getPeso() {
            return peso;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }

        @Override
        public String toString() {
            return "{\n" +
                    "\t\tMaterial: " + material + ",\n" +
                    "\t\tPeso: " + peso + " Kg" +",\n" +
                    "\t}";
        }

    }

    class Rueda {
        private int medida;
        private String tipo;
        private String marca;
        private String modelo;
        private boolean secoLluvia;

        public Rueda(int medida, boolean secoLluvia, String marca, String modelo) {
            this.medida = medida;
            this.secoLluvia = secoLluvia;
            this.tipo = secoLluvia ? "seco" : "lluvia";
            this.marca = marca;
            this.modelo = modelo;
        }

        public int getMedida() {
            return medida;
        }

        public void setMedida(int medida) {
            this.medida = medida;
        }

        public String getTipo() {
            return tipo;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public boolean isSecoLluvia() {
            return secoLluvia;
        }

        public void setSecoLluvia(boolean secoLluvia) {
            this.secoLluvia = secoLluvia;
        }

        @Override
        public String toString() {
            return "{\n" +
                    "\t\tMedida: " + medida + '"' + ",\n" +
                    "\t\tTipo: " + tipo + ",\n" +
                    "\t\tMarca: " + marca + ",\n" +
                    "\t\tModelo: " + modelo + ",\n" +
                    "\t}";
        }

    }

    @Override
    public String toString() {
        return "Coche {" + "\n" +
                "\tMatricula: " + matricula + ",\n" +
                "\tMarca: " + marca + ",\n" +
                "\tModelo: " + modelo + ",\n" +
                "\tPotencia: " + potencia + " cv" + ",\n" +
                "\tVelocidadMaxima: " + velocidadMaxima + " km/h" + ",\n" +
                "\tChasis: " + chasis + ",\n" +
                "\tRueda: " + rueda + ",\n" +
                '}';
    }

}
