import apps.src.FacebookMessenger;
import apps.src.MSNMessenger;
import apps.src.ServicoMensagemInstantanea;
import apps.src.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args){
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if (appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }
        else if (appEscolhido.equals("fbm")){
            smi = new FacebookMessenger();
        }
        else if (appEscolhido.equals("tlg")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
