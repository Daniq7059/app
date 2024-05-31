package com.tecsup.tecsupapp.notas

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tecsup.prototipo_proyecto.R

class NotaViewHolderViendo(inflater:LayoutInflater, parent:ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_nota_viendo, parent, false)){

    private var txtTituloNotasViendo:TextView? = null
    private var txtDocentesNotasViendo:TextView? = null
    private var txtDuracionNotasViendo:TextView? = null

    init {
        txtTituloNotasViendo = itemView.findViewById(R.id.txtTituloNotasViendo)
        txtDocentesNotasViendo = itemView.findViewById(R.id.txtDocentesNotasViendo)
        txtDuracionNotasViendo = itemView.findViewById(R.id.txtDuracionNotasViendo)

    }

    fun data(nota: NotaViendo){
        txtTituloNotasViendo?.text = nota.titulo
        txtDocentesNotasViendo?.text = nota.docente
        txtDuracionNotasViendo?.text = nota.duracion
    }

}