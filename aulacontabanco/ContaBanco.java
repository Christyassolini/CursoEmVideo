package aulacontabanco;

public class ContaBanco {
        
        public int numConta;
        protected String tipo;
        private String dono;
        private float saldo;
        private boolean status;

        public ContaBanco() {
            this.setstatus(false);
            this.setsaldo(0);
        }
        //Métodos Getter e Setter:
        public int getnumConta(){
            return this.numConta;
        }
        public void setnumConta(int n){
            this.numConta = n;
        }
        public String gettipo(){
            return this.tipo;
        }
        public void settipo(String t){
            this.tipo = t;
        }
        public String getdono(){
            return this.tipo;
        }
        public void setdono(String d){
            this.dono = d;
        }
        public float getsaldo(){
            return this.saldo;
        }
        public void setsaldo(float s){
            this.saldo = s;
        }
        public boolean getstatus(){
            return this.status;
        }
        public void setstatus(boolean st){
            this.status = st;
        }

        //Abrir e Fechar Conta Status:
        public void abrirConta(){
            this.settipo(tipo);
            this.status = true;

            if (tipo.equals("CC")){
                this.setsaldo(50);
            }else if(tipo.equals("CP")){
                this.setsaldo(150);
            }
        }

        public void fecharConta(){
            if(saldo > 0){
                System.out.println("ERROR - DÉBITOS PENDENTES");
            } else if(saldo == 0){
                this.status = false;
                System.out.println("SUCCESSFUL");
            }
        }

        //Depositar e Sacar Saldo:
        public void depositar(float v){
            if(v <= 0 || status == false){
                System.out.println("ERROR - VALOR INVÁLIDO");
            }else{
            this.saldo = this.saldo + v;
            System.out.println("SUCCESSFUL");
            }
        }

        public void sacar(float v){
            if(saldo < v){
                System.out.println("ERROR - SALDO INSUFICIENTE");
            }else{
                this.saldo = this.saldo - v;
            }
        //Mensalidade CC e CP:
        }
        public void pagarMensalidade(){
            var v = 0;
            if(tipo == "CC"){
                 v = 12;
            }else if(tipo == "CP"){
                v = 20;
            }

            if(v > saldo){
                System.out.println("ERROR: SALDO INSUFICIENTE");
            }else if(v <= saldo){
                System.out.println("SUCCESSFUL");
            }
        }
}
