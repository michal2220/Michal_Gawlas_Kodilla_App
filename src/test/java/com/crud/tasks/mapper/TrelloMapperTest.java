package com.crud.tasks.mapper;

import com.crud.tasks.domain.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrelloMapperTest {

    TrelloMapper mapper = new TrelloMapper();

    @Test
    void mapToBoards() {
        //Given
        List<TrelloBoardDto> testList = new ArrayList<>();
        testList.add(new TrelloBoardDto("name1", "1", new ArrayList<>()));
        testList.add(new TrelloBoardDto("name2", "2", new ArrayList<>()));

        //When
        List<TrelloBoard> checkList = mapper.mapToBoards(testList);

        //Then
        assertEquals("name1", checkList.get(0).getName());
        assertEquals("name2", checkList.get(1).getName());
    }

    @Test
    void mapToBoardsDto() {
        //Given
        List<TrelloBoard> testList = new ArrayList<>();
        testList.add(new TrelloBoard("name1", "1", new ArrayList<>()));
        testList.add(new TrelloBoard("name2", "2", new ArrayList<>()));

        //When
        List<TrelloBoardDto> checkList = mapper.mapToBoardsDto(testList);

        //Then
        assertEquals("name1", checkList.get(0).getName());
        assertEquals("name2", checkList.get(1).getName());
    }

    @Test
    void mapToList() {
        //Given
        List<TrelloListDto> testList = new ArrayList<>();
        testList.add(new TrelloListDto("id1", "name1", false));
        testList.add(new TrelloListDto("id2", "name2", false));

        //When
        List<TrelloList> checkList = mapper.mapToList(testList);

        //Then
        assertEquals(2, checkList.size());
        assertEquals("id1", checkList.get(0).getId());
    }

    @Test
    void mapToListDto() {
        //Given
        List<TrelloList> testList = new ArrayList<>();
        testList.add(new TrelloList("id1", "name1", false));
        testList.add(new TrelloList("id2", "name2", false));

        //When
        List<TrelloListDto> checkList = mapper.mapToListDto(testList);

        //Then
        assertEquals(2, checkList.size());
        assertEquals("id1", checkList.get(0).getId());
    }

    @Test
    void mapToCardDto() {
        //Given
        TrelloCard trelloCard = new TrelloCard("name", "des", "1", "1");

        //When
        TrelloCardDto trelloCardDto = mapper.mapToCardDto(trelloCard);

        //Then
        assertEquals("name", trelloCardDto.getName());
        assertEquals("des", trelloCardDto.getDescription());
        assertEquals("1", trelloCardDto.getPos());
        assertEquals("1", trelloCardDto.getListId());
    }

    @Test
    void mapToCard() {
        //Given
        TrelloCardDto trelloCardDto = new TrelloCardDto("name", "des", "1", "1");

        //When
        TrelloCard trelloCard = mapper.mapToCard(trelloCardDto);

        //Then
        assertEquals("name", trelloCard.getName());
        assertEquals("des", trelloCard.getDescription());
        assertEquals("1", trelloCard.getPos());
        assertEquals("1", trelloCard.getListId());
    }
}