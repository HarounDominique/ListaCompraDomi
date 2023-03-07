package com.example.listacompradomi

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyLazyColumn(modifier: Modifier = Modifier) {

    LazyColumn(
        Modifier
            .fillMaxSize()
            .padding(10.dp),
        // state = rememberLazyListState(),  //
    ) {
        items(items) { item -> MyGraphicItem(item) }
    }
}

@Composable
fun MyGraphicItem(item: MyItem){
    // item

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
                onCheckedChange = { item.marcado = !item.marcado },
                // other properties like colors, labels, etc.
            )

        }
    }
}

data class MyItem(val nombre: String, var marcado: Boolean)

val items: List<MyItem> = listOf(

    MyItem(
        nombre = "Elemento0",
        marcado = false
    ),
    MyItem(
        nombre = "Elemento1",
        marcado = false
    ),
    MyItem(
        nombre = "Elemento2",
        marcado = false
    ),
    MyItem(
        nombre = "Elemento3",
        marcado = false
    ),
    MyItem(
        nombre = "Elemento4",
        marcado = false
    ),
    MyItem(
        nombre = "Elemento5",
        marcado = false
    ),
    MyItem(
        nombre = "Elemento6",
        marcado = false
    ),
    MyItem(
        nombre = "Elemento0",
        marcado = false
    ),
    MyItem(
        nombre = "Elemento1",
        marcado = false
    ),
    MyItem(
        nombre = "Elemento2",
        marcado = false
    ),
    MyItem(
        nombre = "Elemento3",
        marcado = false
    ),
    MyItem(
        nombre = "Elemento4",
        marcado = false
    ),
    MyItem(
        nombre = "Elemento5",
        marcado = false
    ),
    MyItem(
        nombre = "Elemento6",
        marcado = false
    )
)