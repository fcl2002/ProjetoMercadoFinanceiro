package ecot12.labInvestimentos;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //criando o investidor e sua corretora
        Investidor i1 = new Investidor();
        i1.setNome("Fernando");
        i1.setCpf("123.456.789.01");
        i1.setPerfil("Moderado");

        Corretora co1 = new Corretora();
        co1.setNome("Rico");
        co1.setPais("Brasil");

        CarteiraInvestimento carteira = new CarteiraInvestimento();
        carteira.setNumConta("441311-0");

        System.out.println("\nInvestidor: " + i1.getNome() + "\nPerfil: " + i1.getPerfil()
                           + "\nCorretora: " + co1.getNome() + "\nNumero da conta: " + carteira.getNumConta());

        //criando a lista de Instituições
        ArrayList<Instituicao> instituicoes = new ArrayList<>();

        Banco b1 = new Banco();
        b1.setNome("Banco do Brasil");
        b1.setEhEstatal(true);
        instituicoes.add(b1);

        Empresa e1 = new Empresa();
        e1.setNome("Ambev");
        e1.setEhEstatal(false);
        e1.setCnpj("45.765.345");
        instituicoes.add(e1);

        Empresa e2 = new Empresa();
        e2.setNome("Petrobras");
        e2.setEhEstatal(true);
        e2.setCnpj("23.142.579");
        instituicoes.add(e2);

        Financeira f1 = new Financeira();
        f1.setNome("XP Inc");
        f1.setEhEstatal(false);
        instituicoes.add(f1);

        //imprimindo as Instituições
        System.out.println("\n INSTITUICOES ");
        for (Instituicao i : instituicoes) {
            System.out.println("\nInstituicao: " + i.getNome() + "\nEstatal: " + i.isEhEstatal());
        }

        //criando indicadores do Mercado Financeiro
        Indicador i = new Indicador();
        i.setNome("ROE");
        i.setSignificado("Indica o percentual de retorno sobre o investimento");

        Indicador i2 = new Indicador();
        i.setNome("Margem Bruta");
        i.setSignificado("Demonstra quanto a empresa lucrou ao comercializar os produtos, após a dedução das despesas.");

        //criando a lista de Mercado
        ArrayList<Mercado> lista = new ArrayList<>();
        System.out.println("\n ATIVOS ");

        Acao a1 = e1.emitirTitulo();
        a1.setPrecoCompra(18.70);
        a1.setValor(800);
        a1.setTitulo(e1.getNome());
        a1.setTicket("ABEV3");
        a1.setPreco(15.23);
        lista.add(a1);
        System.out.println("\nTicket: " + a1.getTicket() + "\nPreco atual: " + a1.getPreco() +
                           "\nPreco compra: " + a1.getPrecoCompra());

        Acao a2 = e2.emitirTitulo();
        a2.setPrecoCompra(15.80);
        a2.setValor(500);
        a2.setTitulo(e2.getNome());
        a2.setTicket("PETR4");
        a2.setPreco(21.80);
        lista.add(a2);
        System.out.println("\nTicket: " + a2.getTicket() + "\nPreco atual: " + a2.getPreco() +
                           "Preco compra: " + a2.getPrecoCompra());

        CDB cdb1 = b1.emitirTitulo();
        cdb1.setValor(3500);
        cdb1.setTitulo("CDB Banco do Brasil");
        cdb1.setRentabilidade(12.50);
        lista.add(cdb1);
        System.out.println("\nTitulo: " + cdb1.getTitulo() + "\nRentabilidade: " + cdb1.getRentabilidade());

        CDB cdb2 = b1.emitirTitulo();
        cdb2.setValor(1500);
        cdb2.setTitulo("CDB2 Banco do Brasil");
        cdb2.setRentabilidade(13.75);
        lista.add(cdb2);
        System.out.println("\nTitulo: " + cdb2.getTitulo() + "\nRentabilidade: " + cdb2.getRentabilidade());

        Debenture d1 = f1.emitirTitulo();
        d1.setValor(1000);
        d1.setTitulo("Debenture XP Inc");
        d1.setRentabilidade(15.00);
        d1.setRisco(50);
        lista.add(d1);
        System.out.println("\nTitulo: " + d1.getTitulo() + "\nRentabilidade: " + d1.getRentabilidade());

        Debenture d2 = f1.emitirTitulo();
        d2.setRisco(75);
        d2.setValor(2000);
        d2.setTitulo("Debenture2 XP Inc");
        d2.setRentabilidade(15.00);
        lista.add(d2);
        System.out.println("\nTitulo: " + d1.getTitulo() + "\nRentabilidade: " + d1.getRentabilidade());

        Cambio c1 = new Cambio();
        c1.setTitulo("Cambio Real -> Dolar");
        c1.setValor(100);
        c1.setMoedaOrigem("reais");
        c1.setMoedaTroca("dolares");
        c1.setCotacao(5.30);
        lista.add(c1);
        System.out.println("\nTitulo: " + c1.getTitulo() + "\nValor a ser trocado: " + c1.getValor() +
                           " " + c1.getMoedaOrigem() + "\nCambio: " + c1.troca(100) + " " + c1.getMoedaTroca());

        Cambio c2 = new Cambio();
        c2.setTitulo("Cambio Real -> Euro");
        c2.setValor(100);
        c2.setMoedaOrigem("reais");
        c2.setMoedaTroca("euros");
        c2.setCotacao(5.90);
        lista.add(c2);
        System.out.println("\nTitulo: " + c2.getTitulo() + "\nValor a ser trocado: " + c2.getValor() +
                           " " + c2.getMoedaOrigem() + "\nCambio: " + c2.troca(100) + " " + c2.getMoedaTroca());

        //imprimindo as operações de venda e compra baseado na lista criada
        ImpostoRenda ir = new ImpostoRenda();
        Venda v = new Venda();
        System.out.println("\n OPERACOES DE VENDA\n");
        for (Mercado m : lista) {
            if(m.aceitar(v))
                System.out.println("\nInvestimento: " + m.getTitulo() + "\nValor investido: " + m.getValor() +
                                   "\nIR: " + ir.taxa(m.getValor()));
        }

        Compra c = new Compra();
        System.out.println(("\n OPERACOES DE COMPRA\n"));
        for (Mercado m : lista) {
            if(m.aceitar(c))
                System.out.println("\nInvestimento: " + m.getTitulo() + "\nValor investido: " + m.getValor() +
                                   "\nIR: " + ir.taxa(m.getValor()));
        }
    }
}
