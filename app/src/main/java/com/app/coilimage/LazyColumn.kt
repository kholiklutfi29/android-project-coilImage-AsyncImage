package com.app.coilimage

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.coilimage.model.Person
import com.app.coilimage.repository.PersonRepository
import org.intellij.lang.annotations.PrintFormat

val person = Person(1,"Ladida","dida",20)

@Composable
fun CustomItem(person: Person){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Text(
            text = person.age.toString(),
            color = Color.Black,
            fontSize = MaterialTheme.typography.titleLarge.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = person.firstName,
            color = Color.Black,
            fontSize = MaterialTheme.typography.bodyMedium.fontSize,
            fontWeight = FontWeight.Normal
        )
        Text(
            text = person.lastName,
            color = Color.Black,
            fontSize = MaterialTheme.typography.bodyMedium.fontSize,
            fontWeight = FontWeight.Normal
        )
    }
}

@Composable
fun TryLazyColumn(){
    val personRepository = PersonRepository()
    val getAllData = personRepository.getAllData()
    
    LazyColumn(
        contentPadding = PaddingValues(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ){
        items(items = getAllData){ person ->
            CustomItem(person = person)
        }
    }
}



@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TryLazyStickyHeader(){
    val sections = listOf("A","B","C","D","E")

    LazyColumn(
        contentPadding = PaddingValues(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ){
        sections.forEach { section ->
            stickyHeader {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .padding(12.dp),
                    text = "Section $section"
                )
            }
            items(10){
                Text(
                    modifier = Modifier
                        .padding(12.dp),
                    text = "Item $it from section $section"
                )
            }
        }
    }



}




@Preview
@Composable
fun PreviewCustomItem(){
    CustomItem(person = person)
}

@Preview
@Composable
fun PreviewlazyColumn(){
    TryLazyStickyHeader()
}