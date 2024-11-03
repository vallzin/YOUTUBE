package com.loiane.cursojava.orientcaoobjeto.relacionamentoclasses;

public class ContatoTest {

    public static void main(String[] args) {

        Contato contato = new Contato();

//      Relacionamento tem-um Endereço
        Endereco end = new Endereco();
        end.setRua("Gamer of Throne");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Kings Landing");
        end.setEstado("Westeros");
        end.setCep("99999999");


        contato.setNome("John");
        contato.setEndereco(end);


//      Relacionamento tem-um Endereço
//        contato.setTelefone("85 9999-9999");
        Telefone tel1 = new Telefone();
        tel1.setTipo("celular");
        tel1.setDdd("85");
        tel1.setNumero("9999-9999");

        Telefone tel2 = new Telefone();
        tel2.setTipo("casa");
        tel2.setDdd("85");
        tel2.setNumero("8888-9999");

        Telefone[] tels = new Telefone[2];
        tels[0] = tel1;
        tels[1] = tel2;

        contato.setTelefones(tels);




//        contato.setTelefone(tel);

//      Saída da console
        System.out.println(contato.getNome());
        if(contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

//        if (contato != null && contato.getTelefone() != null) {
//            System.out.println(contato.getTelefone().getDdd()+" "+ tel.getNumero());
//        }

        if (contato != null && contato.getTelefones() != null){
            for (Telefone t : contato.getTelefones()){
                System.out.println(t.getTipo()+": "+t.getDdd()+" "+t.getNumero());
            }
        }
    }

}
