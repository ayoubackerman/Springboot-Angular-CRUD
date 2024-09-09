import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SalleListComponent } from './salle-list/salle-list.component';
import{HttpClientModule} from '@angular/common/http';
import { CreateSalleComponent } from './create-salle/create-salle.component'
import { FormsModule } from '@angular/forms';
import { UpdateSalleComponent } from './update-salle/update-salle.component';
@NgModule({
  declarations: [
    AppComponent,
    SalleListComponent,
    CreateSalleComponent,
    UpdateSalleComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
