package br.edu.ifpr.trabalhoquiz.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.edu.ifpr.trabalhoquiz.R
import br.edu.ifpr.trabalhoquiz.entidades.Usuario
import kotlinx.android.synthetic.main.activity_item_usuario.view.*
import java.text.SimpleDateFormat

class RankingAdapter(var usuarios: List<Usuario>) :
    RecyclerView.Adapter<RankingAdapter.UsuarioViewHolder>() {

    override fun getItemCount() = usuarios.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        UsuarioViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.activity_item_usuario, parent, false)
        )

    override fun onBindViewHolder(holder: UsuarioViewHolder, position: Int) {
        holder.preencherView(usuarios[position])
    }

    inner class UsuarioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun preencherView(usuarios: Usuario) {

            itemView.txtRankingName.text = usuarios.nome
            itemView.txtRankingPontos.text = usuarios.pontuacao.toString()
            itemView.txtRankingJogadas.text = usuarios.partidasJogadas.toString()
            val datef = SimpleDateFormat("dd/MM/yyyy HH:mm")
            itemView.txtRankingUltimaVez.text = (datef.format(usuarios.ultimaPartida))


        }

    }
}

