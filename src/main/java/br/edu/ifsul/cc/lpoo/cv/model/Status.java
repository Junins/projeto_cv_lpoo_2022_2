
package br.edu.ifsul.cc.lpoo.cv.model;

public enum Status {
    
    AGENDADO, CANCELADO_CLIENTE, NAOCOMPARECEU_CLIENTE, CONFIRMADO, EXECUTADO;
    
    public Status getStatus(String status){
        
        if(status.equals(AGENDADO.toString())){
            
            return Status.AGENDADO;
            
        }else if(status.equals(CANCELADO_CLIENTE.toString())){
            
            return Status.CANCELADO_CLIENTE;
            
        }else if(status.equals(NAOCOMPARECEU_CLIENTE.toString())){
         
            return Status.NAOCOMPARECEU_CLIENTE;
            
        }else if(status.equals(CONFIRMADO.toString())){
            
            return Status.CONFIRMADO;
            
        }else if(status.equals(EXECUTADO.toString())){
            
            return Status.EXECUTADO;
            
        }else {
        
            return null;
        }
                
    }
    
}
