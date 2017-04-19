/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs;

import com.sun.tracing.dtrace.ArgsAttributes;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 
 * @author love
 */
public class CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
         
        
                
        System.out.print("IP : ");
        CS deteksiIP = new CS();
        deteksiIP.IPAddress();
        
        System.out.print("Nama Komputer : ");
        deteksiIP.getName();
        
        System.out.print("NsLoop : ");
        //deteksiIP.NsLoop(args);
        // TODO code application logic here
    }
    public void NsLoop(String[] args){
       // = null;
       String host = args[0];
       InetAddress address = null;
       
        try {
           address = Inet4Address.getByName(host);
        } catch (UnknownHostException e) {
            System.out.println("Host Tidak diketahui");
            System.exit(0);
        }
        byte[] IP = address.getAddress();
        for(int i=0; i<IP.length; i++){
            if(i>0){
                System.out.print(".");
                System.out.println(IP[i] & 0xff);
            }
            System.out.println();
        }
    }
    public void getName() throws UnknownHostException{
        InetAddress host = null;
        host = InetAddress.getLocalHost();
        System.out.print(host.getHostName());
        System.out.println();
    }
    public void IPAddress() throws UnknownHostException{
        InetAddress host = null;
        host = InetAddress.getLocalHost();
        byte IP[] = host.getAddress();
        
        for (int i=0; i<IP.length; i++){
           
            if (i>0){
               System.out.print(".");
            }
            
            System.out.print(IP[i] & 0xff);
        }
        System.out.println();
    }
}
