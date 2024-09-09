import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Salle } from '../salle';
import { SalleService } from '../salle.service';

@Component({
  selector: 'app-update-salle',
  templateUrl: './update-salle.component.html',
  styleUrls: ['./update-salle.component.css']
})
export class UpdateSalleComponent implements OnInit {
  salle :Salle =new Salle();
  id!: number;
  constructor(private salleService:SalleService ,private route:ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.id=this.route.snapshot.params['id'];
    this.salleService.getsallebyid(this.id).subscribe(data =>{
      this.salle=data
    })
  }
onSubmit(){
  this.salleService.updatesalle(this.id,this.salle).subscribe(data=>{
    
    this.gotosalle();
  })

}
gotosalle(){
  this.router.navigate(['/salles']);
}
}
