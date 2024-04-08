import pymongo
myclient=pymongo.MongoClient("mongodb://localhost:27017/")
db=myclient["college"]
col=db["studlist"]


myquery =  { "gender": { "$eq": "female" },"course": { "$eq": "MCA" } }
mydoc = col.find(myquery,{"name":1,"mark":1, "_id":0})
print("Name and marks of female students in MCA \nName  \t\t  Marks ")
print("---------------------------------------------------------------------")
for x in mydoc:
    print(x["name"]["fname"]+" "+x["name"]["lname"]+"\t",x["mark"])
print("\n")

print("Details of student in MCA with heighest mark ")
print("---------------------------------------------------------------------")
myquery2={"course":{"$eq":"MCA"}}
mydoc2=col.find(myquery2,{}).sort("mark",-1)
print( "Name : "+ mydoc2[0]["name"]["fname"]+" "+mydoc2[0]["name"]["lname"])
print( "Address : "+ mydoc2[0]["address"]["house_name"]+" "+mydoc2[0]["address"]["city"])
print( "Course : "+ mydoc2[0]["course"])
print( "Mark : ",mydoc2[0]["mark"])
print( "Gender : "+ mydoc2[0]["gender"])
print( "Grade : "+ mydoc2[0]["grade"])
print( "Phone : "+ mydoc2[0]["phone"]["type"]+" ",mydoc2[0]["phone"]["no"])
print("\n")

print("Male students who secured A+ grade ")
print("---------------------------------------------------------------------")
myquery3={"gender":{"$eq":"male"},"grade":{"$eq":'A+'}}
malestudents=col.find(myquery3)
for x in malestudents:
   print(x)
   print("\n")
print("\n")
   
print("Top three students in Mechanical department ")
myquery4={"course":{"$eq":"Mechanical"}}
mechstud=col.find(myquery2,{}).sort("mark",-1)
print("Name")
print("--------------------------------------------------------")
for i in range(3):
    print( mechstud[i]["name"]["fname"]+" "+mechstud[i]["name"]["lname"])
print("\n")

print("Details of female students with marks greater than 90 ")
myquery5={"gender":{"$eq":"female"},"mark":{"$gt":90}}
femscore=col.find(myquery5,{"_id":0,"name":1,"grade":1,"mark":1,"phone":1})
print("Name \t\t Grade \t Marks \t Contact ")
print("---------------------------------------------------------------------")
for x in femscore:
    print(x["name"]["fname"]+" "+x["name"]["lname"]+"\t"+x["grade"]+"\t",x["mark"],"\t",x["phone"]["no"])
print("\n")

print("Details of students with marks greater than 80 but less than  90 ")
myquery6={"$and":[{"mark":{"$lt":90}},{"mark":{"$gte":80}}]}
eighty=col.find(myquery6,{"_id":0,"name":1,"mark":1})
print("Name \t\t Marks ")
print("-------------------------------------------------------------------")
for x in eighty:
     print(x["name"]["fname"]+" "+x["name"]["lname"]+"\t",x["mark"])
print("\n")

print("Details of students whose name starts with 'V' ")
print("---------------------------------------------------------------------")
myquery7= {"name.fname":{"$regex":"^V.*"}}
vnames=col.find(myquery7)
for x in vnames:
    print(x)
    print("\n")
print("\n")

print("Students from Kollam ")
myquery8= {"address.city":{"$eq":"Kollam"}}
kllmstud=col.find(myquery8)
print("Name")
print("---------------------------------------------------------------------")
for x in kllmstud:
    print(x["name"]["fname"]+" "+x["name"]["lname"])
print("\n")

print("Students from neither Kollam nor Thiruvananthapuram ")
myquery9= {"$and":[{"address.city":{"$ne":"Kollam"}},{"address.city":{"$ne":"Thiruvananthapuram"}}] }
stud=col.find(myquery9)
print("Name")
print("---------------------------------------------------------------------")
for x in stud:
    print(x["name"]["fname"]+" "+x["name"]["lname"])
print("\n")

print("Students from either Kollam or Thiruvananthapuram ")
myquery10= {"$or":[{"address.city":{"$eq":"Kollam"}},{"address.city":{"$eq":"Thiruvananthapuram"}}] }
kllmtvmstud=col.find(myquery10)
print("Name")
print("---------------------------------------------------------------------")
for x in kllmtvmstud:
    print(x["name"]["fname"]+" "+x["name"]["lname"])
print("\n")