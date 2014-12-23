-- studies
insert into study(author, publication, title, pubmed_id)
values('Melzer D', 'PLoS Genet', 'A genome-wide association study identifies protein quantitative trait loci (pQTLs)', '18464913');
insert into study(author, publication, title, pubmed_id)
values('Yang J', 'Hum Mol Genet','ELF1 is associated with systemic lupus erythematosus in Asian populations', '21044949');
insert into study(author, publication, title, pubmed_id)
values('Christie JD', 'PLoS Onet','Genome wide association identifies PPFIA1 as a candidate gene for acute lung injury risk following major trauma','22295056');


-- snps
insert into snp(rs_id) values('rs4796217');
insert into snp(rs_id) values('rs5751901');
insert into snp(rs_id) values('rs9303029');
insert into snp(rs_id) values('rs8109578');
insert into snp(rs_id) values('rs10874639');

-- trait associations
insert into trait_association(trait, study_id, snp_id) values('http://www.ebi.ac.uk/efo/EFO_0004623', 1, 1);
insert into trait_association(trait, study_id, snp_id) values('http://www.ebi.ac.uk/efo/EFO_0004623', 1, 2);
insert into trait_association(trait, study_id, snp_id) values('http://www.ebi.ac.uk/efo/EFO_0004623', 1, 3);
insert into trait_association(trait, study_id, snp_id) values('http://www.ebi.ac.uk/efo/EFO_0004623', 1, 4);
insert into trait_association(trait, study_id, snp_id) values('http://www.ebi.ac.uk/efo/EFO_0004623', 1, 5);
