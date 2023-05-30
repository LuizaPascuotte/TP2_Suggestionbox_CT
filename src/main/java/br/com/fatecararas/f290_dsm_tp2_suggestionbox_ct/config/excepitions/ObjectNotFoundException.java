package br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.config.excepitions;

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String message) {
        super(message);
    }
}
