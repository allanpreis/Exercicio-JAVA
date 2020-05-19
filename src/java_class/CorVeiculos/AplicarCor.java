package java_class.CorVeiculos;

public class AplicarCor {

    public static void main(String[] args) {

        Cor prata = new Cor("Prata", 213, 213, 213);
        Cor preto = new Cor("Preto", 0, 0, 0);

        Carro carro = new Carro();
        carro.setModelo("Ford Fusion");
        carro.setQuantidadeLugares(5);
        carro.setComprimento(4.87);
        carro.setQuantidadePortas(4);
        carro.setAnoFabricacao(2015);
        carro.setCor(prata);
        carro.setPlaca("banana");
        carro.setMotor(2.0F);
        carro.detalhesveiculo();

        Aviao aviao = new Aviao();
        aviao.setModelo("SR-71");
        aviao.setQuantidadeLugares(2);
        aviao.setPrefixo("Internacional");
        aviao.setComprimento(37.74);
        aviao.setAnoFabricacao(1966);
        aviao.setCor(preto);
        aviao.setQuantiadadeTurbinas(2);
        aviao.detalhesveiculo();

        Lancha lancha = new Lancha();
        lancha.setModelo("Azimut 83");
        lancha.setQuantidadeLugares(15);
        lancha.setComprimento(25.20);
        lancha.setAnoFabricacao(2015);
        lancha.setCor(prata);
        lancha.setQuantidadeMotores(1);
        lancha.detalhesveiculo();

    }
}
