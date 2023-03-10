package com.example.listacompradomi

import android.content.ClipData.Item
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyLazyColumn(modifier: Modifier = Modifier) {

    var lista =
        remember { items.toMutableStateList() }

    LazyColumn(
        Modifier
            .fillMaxSize()
            .padding(10.dp),
        // state = rememberLazyListState(),  //
    ) {
        items(lista) { item -> MyGraphicItem(item) }
    }
}

@Composable
fun MyGraphicItem(item: MyItem) {

    //var marcado by remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxWidth()) {
        Card(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(.9f)
                .align(CenterHorizontally),
            backgroundColor = Color.LightGray
        ) {
            Text(
                item.nombre,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
            )

            Checkbox(
                checked = item.marcado,
                onCheckedChange = {
                   item.marcado = !item.marcado
                   // marcado = !marcado
                }
            )

        }
    }
}

class MyItem(val nombre: String, marcadoInicial: Boolean = false) {
    var marcado by mutableStateOf(marcadoInicial)
}

val items: List<MyItem> = listOf(

    MyItem(
        nombre = "Elemento0",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento1",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento2",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento3",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento4",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento5",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento6",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento0",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento1",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento2",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento3",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento4",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento5",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento6",
        marcadoInicial = false
    )
)