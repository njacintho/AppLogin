package br.com.cellep.appcellephack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.cellep.appcellephack.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    //Técnica utilizada para inicializar uma variável sem que seja nula
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater) //Método inflate
        setContentView(binding.root) //encaminha através do binding

        // quando o botão Login for clicado, faça...
        binding.btnLoginEntrar.setOnClickListener {

            //Aqui os dados capturados são digitados e slavos em variáveis
            val email = binding.edtLoginEmail.text.toString().trim().toLowerCase()
            val senha = binding.edtLoginSenha.text.toString().trim()

            if (email.isEmpty()){
                binding.edtLoginEmail.error = "Campo obrigatório"
                binding.edtLoginEmail.requestFocus()
            }else if (senha.isEmpty()){
                binding.edtLoginSenha.error = "Campo obrigatório"
                binding.edtLoginSenha.requestFocus()
            }



        }
    }
}