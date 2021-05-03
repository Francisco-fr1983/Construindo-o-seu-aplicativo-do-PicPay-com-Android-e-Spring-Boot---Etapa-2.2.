package br.com.dio.picpayclone.ui.pagar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import br.com.dio.picpayclone.R
import br.com.dio.picpayclone.data.Usuario
import kotlinx.android.synthetic.main.fragment_dashboard.*
import kotlinx.android.synthetic.main.fragment_pagar.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class pagarFragment : Fragment() {

    private val controlador by lazy { findNavController() }

    private lateinit var dashboardViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pagar, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ConfigurarRecyclerView()

    }
    private fun ConfigurarRecyclerView() {
        val listOf = listOf
        Usuario(login = "JoaoV", nomeCompleto = "Joao Vitor Freitas"),
        Usuario(login = "cicero", nomeCompleto = "Cicero")
        )
        recyclerView.adapter = PagarAdapter(listOf) { usuario ->
            VaiParaTransacao(usuario)


        }
    }

    private fun VaiParaTransacao(usuario: Usuario) {
        val direcao = PagarFragmentDirections.actionNavigationPagarToTransacaoFragment()
        controlador.navigation(direcao)
    }
}