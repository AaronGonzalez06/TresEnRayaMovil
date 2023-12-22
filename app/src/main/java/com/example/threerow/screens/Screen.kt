package com.example.threerow.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.threerow.R
import com.example.threerow.modelview.LogicViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Screen(viewModel: LogicViewModel = viewModel()){
    val UiState by viewModel.uiState.collectAsState()

    data class MiObjeto(val num: Int, val drawableId: Int)
    val listImg = mutableListOf(
        MiObjeto(num = 1, drawableId = UiState.img1),
        MiObjeto(num = 2, drawableId = UiState.img2),
        MiObjeto(num = 3, drawableId = UiState.img3),
        MiObjeto(num = 4, drawableId = UiState.img4),
        MiObjeto(num = 5, drawableId = UiState.img5),
        MiObjeto(num = 6, drawableId = UiState.img6),
        MiObjeto(num = 7, drawableId = UiState.img7),
        MiObjeto(num = 8, drawableId = UiState.img8),
        MiObjeto(num = 9, drawableId = UiState.img9),
    )

    Column(
        modifier = Modifier
            .padding(start = 15.dp, end = 15.dp)
            .background(Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyVerticalGrid(
            modifier = Modifier.background(Color.Black),
            columns = GridCells.Fixed(3),
            verticalArrangement = Arrangement.spacedBy(2.dp),
            horizontalArrangement = Arrangement.spacedBy(2.dp)

        ) {
            items(listImg.size) { index ->
                Button(
                    onClick = {
                        viewModel.logic(listImg[index].num)
                    },
                    shape = CutCornerShape(0),
                    colors = ButtonDefaults.buttonColors(containerColor= Color.Black),
                    border = BorderStroke(2.dp,Color.Red)
                ) {
                    Image(
                        painter = painterResource(id = listImg[index].drawableId),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxSize()
                            .height(50.dp)
                    )
                }
            }
        }
        if(UiState.overlap){
            Text(text = "Ya hay en esa casilla", color = Color.Red)
        }
        if(UiState.win){
            Text(text = "se ha ganado", color = Color.Red)
        }
    }

}