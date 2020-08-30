# BankTag
ConstraintLayoutの練習
使用したフリーのリソース
https://www.sketchappsources.com/free-source/1567-banking-app-concept-material-ui-kit-sketch-freebie-resource.html

Navigationを利用し、一部画面遷移できるようにしました。
またNavigationとActionBarとNavigationDrawerを併用できるようにしました。
今回はConstraintLayoutで大枠を囲って、その中でまたConstraintLayoutを使って枠を作るような作りになってしまっていますが、動作が重くなるためConstraintFlowに置き換える必要があります。
現在、ConstraintFlowが使えるバージョンはandroidx.constraintlayout:constraintlayout:2.0.0-rc1となっていてテスト段階のものを使うことになるため、rcが外れた正式版がリリースされたら置き換えてみたいと思います。

作成した画面14画面+NavigationDrawer1画面
![Screenshot_1598276232](https://user-images.githubusercontent.com/37768294/91066490-c2f64f80-e66c-11ea-9ca4-faee254eb40e.png)
![Screenshot_1598281810](https://user-images.githubusercontent.com/37768294/91066496-c4277c80-e66c-11ea-9674-c08383f7576e.png)
![Screenshot_1598281816](https://user-images.githubusercontent.com/37768294/91066503-c4c01300-e66c-11ea-873e-07aa476a7d33.png)
![Screenshot_1598281820](https://user-images.githubusercontent.com/37768294/91066506-c558a980-e66c-11ea-8974-2f39c679486f.png)
![Screenshot_1598281825](https://user-images.githubusercontent.com/37768294/91066508-c558a980-e66c-11ea-80dd-7426ccdfe514.png)
![Screenshot_1598281841](https://user-images.githubusercontent.com/37768294/91066511-c5f14000-e66c-11ea-8812-43b33a584304.png)
![Screenshot_1598281854](https://user-images.githubusercontent.com/37768294/91066515-c5f14000-e66c-11ea-88c1-42bc2b52e99b.png)
![Screenshot_1598281858](https://user-images.githubusercontent.com/37768294/91066516-c689d680-e66c-11ea-8b3f-1cff05bab76f.png)
![Screenshot_1598282135](https://user-images.githubusercontent.com/37768294/91066519-c7226d00-e66c-11ea-94c7-c7ad01eb4587.png)
![Screenshot_1598282290](https://user-images.githubusercontent.com/37768294/91066521-c7226d00-e66c-11ea-83c9-72aa87fe2e9a.png)
![Screenshot_1598282307](https://user-images.githubusercontent.com/37768294/91066523-c7bb0380-e66c-11ea-9843-e848bb7a4130.png)
![Screenshot_1598282429](https://user-images.githubusercontent.com/37768294/91066525-c8539a00-e66c-11ea-9d58-c8feded3d329.png)
![Screenshot_1598282994](https://user-images.githubusercontent.com/37768294/91066528-c8539a00-e66c-11ea-9e50-67860fc585dc.png)
![Screenshot_1598283049](https://user-images.githubusercontent.com/37768294/91066530-c8ec3080-e66c-11ea-8c0b-fd9237353dd4.png)
![Screenshot_1598283993](https://user-images.githubusercontent.com/37768294/91066531-c8ec3080-e66c-11ea-811b-0cbf2c4f5dea.png)

