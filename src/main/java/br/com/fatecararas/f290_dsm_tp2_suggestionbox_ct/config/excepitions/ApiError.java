package br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.config.excepitions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiError {
    private Long timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}
