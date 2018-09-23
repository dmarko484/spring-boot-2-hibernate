

**Entities:**
* Company 
  -> one-to-many users
  -> one-to-many invoices
  
* User
  -> many-to-one Company
  -> one-to-many blogposts
  -> one-to-ne profile

* Profile
  -> one-to-one user
  
* Dicussion
  -> many-to-one  any entity

* BlogPost
  -> many-to-one user

* Invoice
  -> many-to-one vendor
  -> one-to-many line items
  
* InvoiceLineItem
  -> many-to-one products
  
* Product
  -> one-to-many line items
------------------------------

  Company -> Users
          -> Ivoices  
               -> LineItems

               