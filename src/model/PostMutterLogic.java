package model;

import dao.MutterDAO;

public class PostMutterLogic {
  public void execute(Mutter mutter) { // 引数を1つに変更
    MutterDAO dao = new MutterDAO();
    dao.create(mutter);
  }
}