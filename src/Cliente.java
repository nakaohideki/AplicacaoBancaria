import lombok.AllArgsConstructor;
import lombok.Data;
@Data  //notação para implementar os principais métodos como toString, gerar getters e setters.
@AllArgsConstructor  //anotação para gerar um construtor a classe com todos seus atributos
public class Cliente
{
    private String nome;    //nome do cliente
}