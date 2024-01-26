package day18.controller;

import day18.model.dao.BoardDao;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

public class BoardController {


    //싱글톤
    private BoardController(){}
    private static BoardController boardController=new BoardController();
    public static BoardController getInstance(){return boardController;}


    //글쓰기
    public boolean write(BoardDto boardDto){

        boardDto.setMno( MemberController.getInstance().loginMno);

        boolean result=BoardDao.getInstance().write(boardDto);
        return result;
    }
}