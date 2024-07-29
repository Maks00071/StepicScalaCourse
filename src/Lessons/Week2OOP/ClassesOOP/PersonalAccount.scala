package Lessons.Week2OOP.ClassesOOP

class PersonalAccount {
}

class BusinessAccount {
}

class Branch {
  def openAccount(accountType: String) = {
    Account(accountType)
  }
}

object Account {
  def apply(accountType: String): Object = {
    if (accountType == "business") new BusinessAccount
    else new PersonalAccount
  }
}
