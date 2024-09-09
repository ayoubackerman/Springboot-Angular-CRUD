import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SalleListComponent } from './salle-list/salle-list.component';
import { CreateSalleComponent } from './create-salle/create-salle.component';
import { UpdateSalleComponent } from './update-salle/update-salle.component';



const routes: Routes = [
  {path:'salles',component:SalleListComponent},
  
  {path:'sall',component:CreateSalleComponent},
  {path: 'update-salle/:id',component:UpdateSalleComponent},
 
  {path:'',redirectTo:'salles',pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
