package com.example.listacompradomi

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyLazyColumn(modifier: Modifier = Modifier) {
    LazyColumn(
        Modifier
            .fillMaxSize()
            .padding(10.dp),
        // state = rememberLazyListState(),  //
    ) {
        items(items) { item -> MyItem(item) }
    }
}

data class MyItem(val nombre: String, val marcado: Boolean)

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
    )
)