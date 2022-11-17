package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Arquivo {

    public void adicionarGado(Compra c){

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try{

            //append = true adiciona um texto em seguida do outro / append = false sobrescreve o txt antigo
            os = new FileOutputStream("cadastroGado.txt",true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            try{
                if(c.getPrecoVenda() < 2*c.getPeso())
                {
                    throw new PrejuizoException(c.getPrecoVenda());
                } else{
                    bw.write("Gado");
                    bw.newLine();
                    bw.write(c.getId() + "\n");
                    bw.write(c.getRaca() + "\n");
                    bw.write(c.getPeso() + "\n");
                    bw.write(c.getPrecoVenda() + "\n");
                    System.out.println("Gado cadastrado");
                }
            }catch(PrejuizoException e){
            }


        }catch (Exception e){
            System.out.println(e);
        }finally {
            try{
                bw.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public ArrayList<Compra> ler(){

        InputStream is = null;
        InputStreamReader ir = null;
        BufferedReader br = null;
        String lerLinha;

        ArrayList<Compra> al = new ArrayList<>();

        try{

            is = new FileInputStream("cadastroGado.txt");
            ir = new InputStreamReader(is);
            br = new BufferedReader(ir);

            lerLinha = br.readLine();
            while(lerLinha != null){
                if(lerLinha.contains("Gado")){
                    Compra aux = new Compra();
                    aux.setId(Integer.parseInt(br.readLine()));
                    aux.setRaca(br.readLine());
                    aux.setPeso(Integer.parseInt(br.readLine()));
                    aux.setPrecoVenda(Float.parseFloat(br.readLine()));
                    al.add(aux);
                }
                lerLinha = br.readLine();
            }

        }catch(Exception e){
            System.out.println(e);
        }finally{
            try{
                br.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }

        return al;
    }
}

