package dev.lucasmachado.rangprocessoseletivo.validator;

import dev.lucasmachado.rangprocessoseletivo.bean.NotificationBean;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.component.UIInput;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.FacesValidator;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;
import jakarta.inject.Inject;

@FacesValidator(value = "unidadeSaudeForm")
public class UnidadeSaudeFormValidator implements Validator {

    @Inject
    private NotificationBean notificationBean;

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        UIInput faixaCepInicio = (UIInput) component.getAttributes().get("faixaCepInicio");
        UIInput faixaCepFinal = (UIInput) component.getAttributes().get("faixaCepFinal");

        Integer cepInicio = (Integer) faixaCepInicio.getSubmittedValue();
        Integer cepFinal = (Integer) faixaCepFinal.getSubmittedValue();

        if (cepFinal > cepInicio) {
            String error = "O valor final da faixa de cep não pode ser maior que o inicial.";
            notificationBean.addMessage(FacesMessage.SEVERITY_ERROR, error, error);
        }
    }
}
