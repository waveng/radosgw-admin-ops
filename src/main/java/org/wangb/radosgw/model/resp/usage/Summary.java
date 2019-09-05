package org.wangb.radosgw.model.resp.usage;

import java.util.List;

public class Summary {
    
  private String user;
  /**
   * A container for stats summary aggregated total.
   */
  private Categorie total;
  private List<Categorie> categories;

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public Categorie getTotal() {
    return total;
  }

  public void setTotal(Categorie total) {
    this.total = total;
  }

  public List<Categorie> getCategories() {
    return categories;
  }

  public void setCategories(List<Categorie> categories) {
    this.categories = categories;
  }
}
