package br.com.dio.picpayclone.ui.pagar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.dio.picpayclone.R
import br.com.dio.picpayclone.data.Usuario
import kotlinx.android.synthetic.main.fragment_dashboard.view.*
import kotlinx.android.synthetic.main.item_contato.view.*

class PagarAdapter(private val usuario: List<Usuario>, private val onClick: (Usuario) -> Unit):
        RecyclerView.Adapter<PagarAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contato, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val value = usuarios[position]
        holder.bind(usuario)
    }

    override fun getItemCount(): Int = usuario.size
    }
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(usuario: Usuario) {
            with(itemView) {
                textViewLogin.text = usuario.login
                textViewNomeCompleto.text = usuario.nomeCompleto
                setOnClickListener {
                    onClick(usuario)
                }

        }

    }
}