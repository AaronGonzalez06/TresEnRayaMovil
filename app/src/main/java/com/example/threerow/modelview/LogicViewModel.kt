package com.example.threerow.modelview

import androidx.lifecycle.ViewModel
import com.example.threerow.R
import com.example.threerow.state.DateUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class LogicViewModel : ViewModel() {
    var user=true
    var pc = false

    val matriz: Array<Array<String>> = Array(3) { Array(3) { "" } }

    private val _uiState = MutableStateFlow(DateUiState())
    val uiState: StateFlow<DateUiState> = _uiState.asStateFlow()



    fun logic(num:Int,) {
        if(user){
            when (num) {
                1 -> {
                    if (overlap(num)){
                        return
                    }
                    add(num,"U")
                    _uiState.update { currentState -> currentState.copy(
                        img1= R.drawable.sinfondo,
                        overlap= false
                    ) }
                    if(horizontalVerification("U") || verticalVerification("U") || diagonalVerification("U")){
                        _uiState.update { currentState -> currentState.copy(
                            win = true
                        ) }
                    }
                }
                2 -> {
                    if (overlap(num)){
                        return
                    }
                    add(num,"U")
                    _uiState.update { currentState -> currentState.copy(
                        img2= R.drawable.sinfondo,
                        overlap= false
                    ) }
                    if(horizontalVerification("U") || verticalVerification("U") || diagonalVerification("U")){
                        _uiState.update { currentState -> currentState.copy(
                            win = true
                        ) }
                    }
                }
                3 -> {
                    if (overlap(num)){
                        return
                    }
                    add(num,"U")
                    _uiState.update { currentState -> currentState.copy(
                        img3= R.drawable.sinfondo,
                        overlap= false
                    ) }
                    if(horizontalVerification("U") || verticalVerification("U") || diagonalVerification("U")){
                        _uiState.update { currentState -> currentState.copy(
                            win = true
                        ) }
                    }
                }
                4 -> {
                    if (overlap(num)){
                        return
                    }
                    add(num,"U")
                    _uiState.update { currentState -> currentState.copy(
                        img4= R.drawable.sinfondo,
                        overlap= false
                    ) }
                    if(horizontalVerification("U") || verticalVerification("U") || diagonalVerification("U")){
                        _uiState.update { currentState -> currentState.copy(
                            win = true
                        ) }
                    }
                }
                5 -> {
                    if (overlap(num)){
                        return
                    }
                    add(num,"U")
                    _uiState.update { currentState -> currentState.copy(
                        img5= R.drawable.sinfondo,
                        overlap= false
                    ) }
                    if(horizontalVerification("U") || verticalVerification("U") || diagonalVerification("U")){
                        _uiState.update { currentState -> currentState.copy(
                            win = true
                        ) }
                    }
                }
                6 -> {
                    if (overlap(num)){
                        return
                    }
                    add(num,"U")
                    _uiState.update { currentState -> currentState.copy(
                        img6= R.drawable.sinfondo,
                        overlap= false
                    ) }
                    if(horizontalVerification("U") || verticalVerification("U") || diagonalVerification("U")){
                        _uiState.update { currentState -> currentState.copy(
                            win = true
                        ) }
                    }
                }
                7 -> {
                    if (overlap(num)){
                        return
                    }
                    add(num,"U")
                    _uiState.update { currentState -> currentState.copy(
                        img7= R.drawable.sinfondo,
                        overlap= false
                    ) }
                    if(horizontalVerification("U") || verticalVerification("U") || diagonalVerification("U")){
                        _uiState.update { currentState -> currentState.copy(
                            win = true
                        ) }
                    }
                }
                8 -> {
                    if (overlap(num)){
                        return
                    }
                    add(num,"U")
                    _uiState.update { currentState -> currentState.copy(
                        img8= R.drawable.sinfondo,
                        overlap= false
                    ) }
                    if(horizontalVerification("U") || verticalVerification("U") || diagonalVerification("U")){
                        _uiState.update { currentState -> currentState.copy(
                            win = true
                        ) }
                    }
                }
                9 -> {
                    if (overlap(num)){
                        return
                    }
                    add(num,"U")
                    _uiState.update { currentState -> currentState.copy(
                        img9= R.drawable.sinfondo,
                        overlap= false
                    ) }
                    if(horizontalVerification("U") || verticalVerification("U") || diagonalVerification("U")){
                        _uiState.update { currentState -> currentState.copy(
                            win = true
                        ) }
                    }
                }
            }
            user=false
            pc=true
        }else{
            when (num) {
                1 -> {
                    if (overlap(num)){
                        return
                    }
                    add(num,"P")
                    _uiState.update { currentState -> currentState.copy(
                        img1= R.drawable.sinfondo2,
                        overlap= false
                    ) }
                    if(horizontalVerification("P") || verticalVerification("P") || diagonalVerification("P")){
                        _uiState.update { currentState -> currentState.copy(
                            win = true
                        ) }
                    }
                }
                2 -> {
                    if (overlap(num)){
                        return
                    }
                    add(num,"P")
                    _uiState.update { currentState -> currentState.copy(
                        img2= R.drawable.sinfondo2,
                        overlap= false
                    ) }
                    if(horizontalVerification("P") || verticalVerification("P") || diagonalVerification("P")){
                        _uiState.update { currentState -> currentState.copy(
                            win = true
                        ) }
                    }
                }
                3 -> {
                    if (overlap(num)){
                        return
                    }
                    add(num,"P")
                    _uiState.update { currentState -> currentState.copy(
                        img3= R.drawable.sinfondo2,
                        overlap= false
                    ) }
                    if(horizontalVerification("P") || verticalVerification("P") || diagonalVerification("P")){
                        _uiState.update { currentState -> currentState.copy(
                            win = true
                        ) }
                    }
                }
                4 -> {
                    if (overlap(num)){
                        return
                    }
                    add(num,"P")
                    _uiState.update { currentState -> currentState.copy(
                        img4= R.drawable.sinfondo2,
                        overlap= false
                    ) }
                    if(horizontalVerification("P") || verticalVerification("P") || diagonalVerification("P")){
                        _uiState.update { currentState -> currentState.copy(
                            win = true
                        ) }
                    }
                }
                5 -> {
                    if (overlap(num)){
                        return
                    }
                    add(num,"P")
                    _uiState.update { currentState -> currentState.copy(
                        img5= R.drawable.sinfondo2,
                        overlap= false
                    ) }
                    if(horizontalVerification("P") || verticalVerification("P") || diagonalVerification("P")){
                        _uiState.update { currentState -> currentState.copy(
                            win = true
                        ) }
                    }
                }
                6 -> {
                    if (overlap(num)){
                        return
                    }
                    add(num,"P")
                    _uiState.update { currentState -> currentState.copy(
                        img6= R.drawable.sinfondo2,
                        overlap= false
                    ) }
                    if(horizontalVerification("P") || verticalVerification("P") || diagonalVerification("P")){
                        _uiState.update { currentState -> currentState.copy(
                            win = true
                        ) }
                    }
                }
                7 -> {
                    if (overlap(num)){
                        return
                    }
                    add(num,"P")
                    _uiState.update { currentState -> currentState.copy(
                        img7= R.drawable.sinfondo2,
                        overlap= false
                    ) }
                    if(horizontalVerification("P") || verticalVerification("P") || diagonalVerification("P")){
                        _uiState.update { currentState -> currentState.copy(
                            win = true
                        ) }
                    }
                }
                8 -> {
                    if (overlap(num)){
                        return
                    }
                    add(num,"P")
                    _uiState.update { currentState -> currentState.copy(
                        img8= R.drawable.sinfondo2,
                        overlap= false
                    ) }
                    if(horizontalVerification("P") || verticalVerification("P") || diagonalVerification("P")){
                        _uiState.update { currentState -> currentState.copy(
                            win = true
                        ) }
                    }
                }
                9 -> {
                    if (overlap(num)){
                        return
                    }
                    add(num,"P")
                    _uiState.update { currentState -> currentState.copy(
                        img9= R.drawable.sinfondo2,
                        overlap= false
                    ) }
                    if(horizontalVerification("P") || verticalVerification("P") || diagonalVerification("P")){
                        _uiState.update { currentState -> currentState.copy(
                            win = true
                        ) }
                    }
                }
            }
            user=true
            pc=false
        }
    }

    private fun overlap(num:Int):Boolean{
        var aux=1
        for ((x, fila) in matriz.withIndex()) {
            for ((y, elemento) in fila.withIndex()) {
                if(aux== num){
                     if(matriz[x][y] != ""){

                         _uiState.update { currentState -> currentState.copy(
                             overlap= true
                         ) }

                        return true
                     }
                }
                aux++
            }
        }
        return  false
    }

    private fun add(num:Int,sign:String){
        var aux=1
        for ((x, fila) in matriz.withIndex()) {
            for ((y, elemento) in fila.withIndex()) {
                if(aux== num){
                    matriz[x][y] = sign
                }
                aux++
            }
        }
    }

    private fun horizontalVerification(sing:String):Boolean{
        var aux=0
        for ((x, fila) in matriz.withIndex()) {
            aux=0
            for ((y, elemento) in fila.withIndex()) {
                if(matriz[x][y] == sing){
                    aux++
                }
            }
            if(aux == 3){
                return true
            }
        }
        return false
    }

    private fun verticalVerification(sing:String):Boolean{
        var aux=0
        for ((x, fila) in matriz.withIndex()) {
            aux=0
            for ((y, elemento) in fila.withIndex()) {
                if(matriz[y][x] == sing){
                    aux++
                }
            }
            if(aux == 3){
                return true
            }
        }
        return false
    }

    private fun diagonalVerification(sing: String): Boolean {
        return (matriz[0][0] == sing && matriz[1][1] == sing && matriz[2][2] == sing) ||
                (matriz[0][2] == sing && matriz[1][1] == sing && matriz[2][0] == sing)
    }

}