package com.example.superfoot;

import android.content.ContentValues;

public class JogadoresIniciais {

    public Jogador[] js;

    public JogadoresIniciais() {

        js = new Jogador[125];
        // JOGADORES DA LOJA
        js[0] = new Jogador(0,0, "Neymar Jr", 98, 25, 100, 98, 1, 0, "d", 0, 0);
        js[1] = new Jogador(0, 0, "Pelé", 99, 25, 100, 98, 1, 0, "d", 0, 0);
        js[2] = new Jogador(0, 0, "Firmino", 88, 25, 100, 98, 2, 0, "d", 0, 0);
        js[3] = new Jogador(0, 0, "Ronaldo", 92, 25, 100, 98, 1, 0, "d", 0, 0);
        js[4] = new Jogador(0,0, "Cristiano Ronaldo", 97, 25, 100, 98, 2, 0, "d", 0, 0);
        js[5] = new Jogador(0,0, "Rivaldo", 89, 25, 100, 98, 3, 0, "d", 0, 0);
        js[6] = new Jogador(0,0, "Rivelino", 95, 25, 100, 98, 1, 0, "d", 0, 0);
        js[7] = new Jogador(0,0, "Zagalo", 68, 25, 100, 98, 2, 0, "d", 0, 0);
        js[8] = new Jogador(0,0, "João", 79, 25, 100, 98, 3, 0, "d", 0, 0);
        js[9] = new Jogador(0,0, "Cortez", 65, 25, 100, 98, 3, 0, "d", 0, 0);
        js[10] = new Jogador(0,0, "Messi", 93, 25, 100, 98, 3, 0, "d", 0, 0);
        js[11] = new Jogador(0,0, "Zidani", 90, 25, 100, 98, 3, 0, "d", 0, 0);
        js[12] = new Jogador(0,0, "Renato", 68, 25, 100, 98, 2, 0, "d", 0, 0);
        js[13] = new Jogador(0,0, "Philipe Coutinho", 83, 25, 100, 98, 2, 0, "d", 0, 0);
        js[14] = new Jogador(0,0, "Marcelo", 84, 25, 100, 98, 2, 0, "d", 0, 0);
        js[15] = new Jogador(0,0, "Alisson", 95, 25, 100, 98, 1, 0, "d", 0, 0);
        js[16] = new Jogador(0,0, "Mbappe", 78, 25, 100, 98, 1, 0, "d", 0, 0);
        js[17] = new Jogador(0,0, "Daniel Alves", 85, 25, 100, 98, 1, 0, "d", 0, 0);
        js[18] = new Jogador(0,0, "Rabiot", 88, 25, 100, 98, 1, 0, "d", 0, 0);
        js[19] = new Jogador(0,0, "Bale", 90, 25, 100, 98, 1, 0, "d", 0, 0);
        js[20] = new Jogador(0,0, "Benzema", 89, 25, 100, 98, 1, 0, "d", 0, 0);

        // JOGADORES INICIAIS
        js[21] = new Jogador(0,1, "Douglas dos Santos", 35, 25, 100, 98, 1, 0, "d", 0, 0);
        js[22] = new Jogador(0,1, "Luan Martins", 38, 25, 100, 98, 2, 0, "d", 0, 0);
        js[23] = new Jogador(0,1, "Igor Fernandes", 42, 25, 100, 98, 2, 0, "d", 0, 0);
        js[24] = new Jogador(0,1, "Alex da Silva", 43, 25, 100, 98, 2, 0, "d", 0, 0);
        js[25] = new Jogador(0,1, "Pedro Silva", 40, 25, 100, 98, 2, 0, "d", 0, 0);
        js[26] = new Jogador(0,1, "Rodrigo Moledo", 37, 25, 100, 98, 2, 0, "d", 0, 0);
        js[27] = new Jogador(0,1, "Marcelo Lomba", 39, 25, 100, 98, 3, 0, "d", 0, 0);
        js[28] = new Jogador(0,1, "Guilherme Parede", 47, 25, 100, 98, 3, 0, "d", 0, 0);
        js[29] = new Jogador(0,1, "Igor Gomes", 50, 25, 100, 98, 1, 0, "d", 0, 0);
        js[30] = new Jogador(0,1, "Danilo Neves", 48, 25, 100, 98, 1, 0, "d", 0, 0);
        js[31] = new Jogador(0,1, "Bruno Alves", 30, 25, 100, 98, 3, 0, "d", 0, 0);
        js[32] = new Jogador(0,1, "Jean Paulo", 32, 25, 100, 98, 3, 0, "d", 0, 0);
        js[33] = new Jogador(0,1, "Artur Victor", 34, 25, 100, 98, 3, 0, "d", 0, 0);
        js[34] = new Jogador(0,1, "Elton Junior", 37, 25, 100, 98, 1, 0, "d", 0, 0);


        // JOGADORES FLAMENGO
        js[35] = new Jogador(0,2, "Gustavo", 72, 25, 100, 98, 1, 0, "d", 0, 0);
        js[36] = new Jogador(0,2, "Diego Ribas", 81, 25, 100, 98, 2, 0, "d", 0, 0);
        js[37] = new Jogador(0,2, "Giorgian", 82, 25, 100, 98, 2, 0, "d", 0, 0);
        js[38] = new Jogador(0,2, "Gabriel Barbosa", 77, 25, 100, 98, 2, 0, "d", 0, 0);
        js[39] = new Jogador(0,2, "Bruno Henrique", 65, 25, 100, 98, 2, 0, "d", 0, 0);
        js[40] = new Jogador(0,2, "Victor Vinicius", 68, 25, 100, 98, 2, 0, "d", 0, 0);
        js[41] = new Jogador(0,2, "Everton Coelho", 81, 25, 100, 98, 3, 0, "d", 0, 0);
        js[42] = new Jogador(0,2, "Rodrico Caio", 65, 25, 100, 98, 3, 0, "d", 0, 0);
        js[43] = new Jogador(0,2, "Diego Alves", 59, 25, 100, 98, 1, 0, "d", 0, 0);
        js[44] = new Jogador(0,2, "Orlando Berro", 75, 25, 100, 98, 1, 0, "d", 0, 0);

        // JOGADORES FIGUEIRENESE
        js[45] = new Jogador(0,3, "Denis Cesar", 33, 25, 100, 98, 1, 0, "d", 0, 0);
        js[46] = new Jogador(0,3, "Jose Antonio", 35, 25, 100, 98, 1, 0, "d", 0, 0);
        js[47] = new Jogador(0,3, "Betinho", 41, 25, 100, 98, 2, 0, "d", 0, 0);
        js[48] = new Jogador(0,3, "Rafael Marques", 47, 25, 100, 98, 2, 0, "d", 0, 0);
        js[49] = new Jogador(0,3, "Matheus Caldeira", 43, 25, 100, 98, 2, 0, "d", 0, 0);
        js[50] = new Jogador(0,3, "Joao Diogo", 35, 25, 100, 98, 2, 0, "d", 0, 0);
        js[51] = new Jogador(0,3, "Tony Carvalho", 51, 25, 100, 98, 3, 0, "d", 0, 0);
        js[52] = new Jogador(0,3, "Alipio", 52, 25, 100, 98, 3, 0, "d", 0, 0);
        js[53] = new Jogador(0,3, "Matheus Marthins", 41, 25, 100, 98, 1, 0, "d", 0, 0);
        js[54] = new Jogador(0,3, "Jucimar JOse", 42, 25, 100, 98, 1, 0, "d", 0, 0);

        // JOGADORES AVAÍ
        js[55] = new Jogador(0,4, "Douglas dos Santos", 38, 25, 100, 98, 1, 0, "d", 0, 0);
        js[56] = new Jogador(0,4, "Ebert Willian", 41, 25, 100, 98, 2, 0, "d", 0, 0);
        js[57] = new Jogador(0,4, "Daniel Amorin", 45, 25, 100, 98, 2, 0, "d", 0, 0);
        js[58] = new Jogador(0,4, "Andre Francisco", 42, 25, 100, 98, 2, 0, "d", 0, 0);
        js[59] = new Jogador(0,4, "Marcos Roberto", 44, 25, 100, 98, 2, 0, "d", 0, 0);
        js[60] = new Jogador(0,4, "Pedro Castro", 33, 25, 100, 98, 2, 0, "d", 0, 0);
        js[61] = new Jogador(0,4, "Brenner Marlos", 41, 25, 100, 98, 3, 0, "d", 0, 0);
        js[62] = new Jogador(0,4, "Vladimir Orlando", 42, 25, 100, 98, 3, 0, "d", 0, 0);
        js[63] = new Jogador(0,4, "Luan Martins", 42, 25, 100, 98, 3, 0, "d", 0, 0);
        js[64] = new Jogador(0,4, "Alex da Silva", 48, 25, 100, 98, 1, 0, "d", 0, 0);

        // JOGADORES SAO PAULO
        js[65] = new Jogador(0,5, "Nene", 52, 25, 100, 98, 1, 0, "d", 0, 0);
        js[66] = new Jogador(0,5, "Alexandre Pato", 55, 25, 100, 98, 2, 0, "d", 0, 0);
        js[67] = new Jogador(0,5, "Antony Matheus", 57, 25, 100, 98, 2, 0, "d", 0, 0);
        js[68] = new Jogador(0,5, "Everton Cardoso", 63, 25, 100, 98, 2, 0, "d", 0, 0);
        js[69] = new Jogador(0,5, "Hernandes", 60, 25, 100, 98, 2, 0, "d", 0, 0);
        js[70] = new Jogador(0,5, "Danilo Neves", 64, 25, 100, 98, 2, 0, "d", 0, 0);
        js[71] = new Jogador(0,5, "Igor Gomes", 77, 25, 100, 98, 3, 0, "d", 0, 0);
        js[72] = new Jogador(0,5, "Hudson", 71, 25, 100, 98, 3, 0, "d", 0, 0);
        js[73] = new Jogador(0,5, "Liziero", 62, 25, 100, 98, 1, 0, "d", 0, 0);
        js[74] = new Jogador(0,5, "Jonas Toró", 60, 25, 100, 98, 1, 0, "d", 0, 0);

        // JOGADORES INTERNACIONAL
        js[75] = new Jogador(0,6, "Paolo Guerreiro", 54, 25, 100, 98, 1, 0, "d", 0, 0);
        js[76] = new Jogador(0,6, "Edenilson Andrade", 62, 25, 100, 98, 2, 0, "d", 0, 0);
        js[77] = new Jogador(0,6, "Nicolas Frederico", 52, 25, 100, 98, 2, 0, "d", 0, 0);
        js[78] = new Jogador(0,6, "Nonato", 63, 65, 100, 98, 2, 0, "d", 0, 0);
        js[79] = new Jogador(0,6, "Rafael Sobis", 51, 25, 100, 98, 2, 0, "d", 0, 0);
        js[80] = new Jogador(0,6, "Jose Carlos", 69, 25, 100, 98, 2, 0, "d", 0, 0);
        js[81] = new Jogador(0,6, "Patrick", 52, 25, 100, 98, 3, 0, "d", 0, 0);
        js[82] = new Jogador(0,6, "Martins Sarrafiore", 67, 25, 100, 98, 3, 0, "d", 0, 0);
        js[83] = new Jogador(0,6, "Guilherme Parede", 52, 25, 100, 98, 1, 0, "d", 0, 0);
        js[84] = new Jogador(0,6, "Rodrigo Moledo", 61, 25, 100, 98, 1, 0, "d", 0, 0);

        // JOGADORES SANTOS
        js[85] = new Jogador(0,7, "Rodrigo Silva", 55, 25, 100, 98, 1, 0, "d", 0, 0);
        js[86] = new Jogador(0,7, "Yeferson Soteldo", 68, 25, 100, 98, 1, 0, "d", 0, 0);
        js[87] = new Jogador(0,7, "Christian Cueva", 52, 25, 100, 98, 2, 0, "d", 0, 0);
        js[88] = new Jogador(0,7, "Fernando Uribe", 53, 25, 100, 98, 2, 0, "d", 0, 0);
        js[89] = new Jogador(0,7, "Carlos Andres", 50, 25, 100, 98, 2, 0, "d", 0, 0);
        js[90] = new Jogador(0,7, "Vanderlei Farias", 66, 25, 100, 98, 2, 0, "d", 0, 0);
        js[91] = new Jogador(0,7, "Diego Pituca", 51, 25, 100, 98, 2, 0, "d", 0, 0);
        js[92] = new Jogador(0,7, "Gustavo Henrique", 67, 25, 100, 98, 3, 0, "d", 0, 0);
        js[93] = new Jogador(0,7, "Jorge Marco", 50, 25, 100, 98, 1, 0, "d", 0, 0);
        js[94] = new Jogador(0,7, "Eduardo Sasha", 48, 25, 100, 98, 3, 0, "d", 0, 0);

        // JOGADORES BAHIA
        js[95] = new Jogador(0,8, "Gilberto Oliveira", 55, 25, 100, 98, 1, 0, "d", 0, 0);
        js[96] = new Jogador(0,8, "Eric dos Santos", 48, 25, 100, 98, 2, 0, "d", 0, 0);
        js[97] = new Jogador(0,8, "Arthur Caike", 42, 25, 100, 98, 3, 0, "d", 0, 0);
        js[98] = new Jogador(0,8, "Artur Victor", 43, 25, 100, 98, 2, 0, "d", 0, 0);
        js[99] = new Jogador(0,8, "Jose Fernando", 51, 25, 100, 98, 2, 0, "d", 0, 0);
        js[100] = new Jogador(0,8, "Douglas Friedrich", 46, 25, 100, 98, 2, 0, "d", 0, 0);
        js[101] = new Jogador(0,8, "Douglas Augusto", 41, 25, 100, 98, 3, 0, "d", 0, 0);
        js[102] = new Jogador(0,8, "Gregore", 37, 25, 100, 98, 3, 0, "d", 0, 0);
        js[103] = new Jogador(0,8, "Jose Elber", 39, 25, 100, 98, 1, 0, "d", 0, 0);
        js[104] = new Jogador(0,8, "Elton Junior", 38, 25, 100, 98, 1, 0, "d", 0, 0);

        // JOGADORES GREMIO
        js[105] = new Jogador(0,9, "Everton Sousa", 75, 25, 100, 98, 1, 0, "d", 0, 0);
        js[106] = new Jogador(0,9, "Luan Guilherme", 58, 25, 100, 98, 1, 0, "d", 0, 0);
        js[107] = new Jogador(0,9, "Andre Felipe", 67, 25, 100, 98, 2, 0, "d", 0, 0);
        js[108] = new Jogador(0,9, "Walter", 63, 25, 100, 98, 2, 0, "d", 0, 0);
        js[109] = new Jogador(0,9, "Mario Sergio", 61, 25, 100, 98, 2, 0, "d", 0, 0);
        js[110] = new Jogador(0,9, "Pedro Geromel", 66, 25, 100, 98, 2, 0, "d", 0, 0);
        js[111] = new Jogador(0,9, "Maicon", 59, 55, 100, 98, 3, 0, "d", 0, 0);
        js[112] = new Jogador(0,9, "Diego Tardelli", 67, 25, 100, 98, 3, 0, "d", 0, 0);
        js[113] = new Jogador(0,9, "Felipe Vizeu", 50, 25, 100, 98, 2, 0, "d", 0, 0);
        js[114] = new Jogador(0,9, "Jean", 68, 25, 100, 98, 1, 0, "d", 0, 0);

        // JOGADORES CORINTHIANS
        js[115] = new Jogador(0,10, "Angel Romero", 75, 25, 100, 98, 1, 0, "d", 0, 0);
        js[116] = new Jogador(0,10, "Cassio Ramos", 67, 25, 100, 98, 2, 0, "d", 0, 0);
        js[117] = new Jogador(0,10, "Fagner", 75, 25, 100, 98, 1, 0, "d", 0, 0);
        js[118] = new Jogador(0,10, "Jadson", 68, 25, 100, 98, 2, 0, "d", 0, 0);
        js[119] = new Jogador(0,10, "Gustavo", 70, 25, 100, 98, 2, 0, "d", 0, 0);
        js[120] = new Jogador(0,10, "Junior Urso", 57, 25, 100, 98, 2, 0, "d", 0, 0);
        js[121] = new Jogador(0,10, "Clayson", 78, 25, 100, 98, 2, 0, "d", 0, 0);
        js[122] = new Jogador(0,10, "Vagner Love", 67, 25, 100, 98, 3, 0, "d", 0, 0);
        js[123] = new Jogador(0,10, "Danilo Avelar", 70, 25, 100, 98, 1, 0, "d", 0, 0);
        js[124] = new Jogador(0,10, "Mauro Boselli", 68, 25, 100, 98, 1, 0, "d", 0, 0);

    }

}
