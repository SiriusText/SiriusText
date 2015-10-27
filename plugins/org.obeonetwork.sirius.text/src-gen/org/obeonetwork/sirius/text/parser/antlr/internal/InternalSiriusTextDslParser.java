package org.obeonetwork.sirius.text.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.obeonetwork.sirius.text.services.SiriusTextDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSiriusTextDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCUMENTATION", "RULE_ID", "RULE_STRING", "RULE_EXPRESSION", "RULE_INT", "RULE_WS", "'package'", "'.'", "'.*'", "'import'", "'designer'", "'as'", "'{'", "'}'", "'viewpoint'", "'modelFileExtensions'", "'='", "'['", "','", "']'", "'icon'", "'representations'", "'@Initialized'", "'@ShowOnStartup'", "'@EnablePopupBars'", "'@MetamodelUris'", "'({'", "'})'", "'diagram'", "'for'", "'?'", "'documentation'", "'titleExpression'", "'rootExpression'", "'defaultLayer'", "'additionalLayers'", "'layer'", "'mappings'", "'edges'", "'sections'", "'section'", "'tools'", "'@ForceRefresh'", "'@NodeCreationVariable'", "'('", "')'", "'@ContainerViewVariable'", "'containerCreation'", "'containerMappings'", "'extraMappings'", "'begin'", "'changeContext'", "':'", "'if'", "'set'", "'featureName'", "'valueExpression'", "'unset'", "'elementExpression'", "'createInstance'", "'referenceName'", "'type'", "'createView'", "'mapping'", "'containerViewExpression'", "'createEdgeView'", "'sourceExpression'", "'targetExpression'", "'deleteView'", "'()'", "'remove'", "'move'", "'newContainerExpression'", "'switch'", "'case'", "'default'", "'list'", "'container'", "'style'", "'semanticCandidatesExpression'", "'gradient'", "'from'", "'to'", "'label'", "'in'", "'border'", "'size'", "'heightComputationExpression'", "'widthComputationExpression'", "'relationBasedEdge'", "'sourceMappings'", "'targetMappings'", "'targetFileExpression'", "'edgeStyle'", "'line'", "'routing'", "'sourceArrow'", "'targetArrow'", "'sizeComputationExpression'", "'foldingStyle'", "'endsCentering'", "'palette'", "'color'", "'rgb('", "'left'", "'center'", "'right'", "'oblique'", "'lefttoright'", "'toptobottom'", "'solid'", "'dash'", "'dot'", "'dash_dot'", "'straight'", "'manhattan'", "'tree'", "'NoDecoration'", "'OutputArrow'", "'InputArrow'", "'OutputClosedArrow'", "'InputClosedArrow'", "'OutputFillClosedArrow'", "'InputFillClosedArrow'", "'Diamond'", "'FillDiamond'", "'InputArrowWithDiamond'", "'InputArrowWithFillDiamond'", "'none'", "'source'", "'target'", "'both'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=8;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__10=10;
    public static final int T__98=98;
    public static final int RULE_DOCUMENTATION=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=6;
    public static final int RULE_EXPRESSION=7;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalSiriusTextDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSiriusTextDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSiriusTextDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSiriusTextDsl.g"; }



     	private SiriusTextDslGrammarAccess grammarAccess;
     	
        public InternalSiriusTextDslParser(TokenStream input, SiriusTextDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SiriusFile";	
       	}
       	
       	@Override
       	protected SiriusTextDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSiriusFile"
    // InternalSiriusTextDsl.g:68:1: entryRuleSiriusFile returns [EObject current=null] : iv_ruleSiriusFile= ruleSiriusFile EOF ;
    public final EObject entryRuleSiriusFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiriusFile = null;


        try {
            // InternalSiriusTextDsl.g:69:2: (iv_ruleSiriusFile= ruleSiriusFile EOF )
            // InternalSiriusTextDsl.g:70:2: iv_ruleSiriusFile= ruleSiriusFile EOF
            {
             newCompositeNode(grammarAccess.getSiriusFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiriusFile=ruleSiriusFile();

            state._fsp--;

             current =iv_ruleSiriusFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSiriusFile"


    // $ANTLR start "ruleSiriusFile"
    // InternalSiriusTextDsl.g:77:1: ruleSiriusFile returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) ) ) ;
    public final EObject ruleSiriusFile() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:80:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) ) ) )
            // InternalSiriusTextDsl.g:81:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) ) )
            {
            // InternalSiriusTextDsl.g:81:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) ) )
            // InternalSiriusTextDsl.g:81:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) )
            {
            // InternalSiriusTextDsl.g:81:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DOCUMENTATION) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSiriusTextDsl.g:82:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:82:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:83:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_3); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getSiriusFileAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSiriusFileRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,10,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getSiriusFileAccess().getPackageKeyword_1());
                
            // InternalSiriusTextDsl.g:103:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:104:1: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:104:1: (lv_name_2_0= ruleQualifiedName )
            // InternalSiriusTextDsl.g:105:3: lv_name_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getSiriusFileAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSiriusFileRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:121:2: ( (lv_imports_3_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:122:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalSiriusTextDsl.g:122:1: (lv_imports_3_0= ruleImport )
            	    // InternalSiriusTextDsl.g:123:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSiriusFileAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSiriusFileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_3_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSiriusTextDsl.g:139:3: ( (lv_body_4_0= ruleSiriusFileBody ) )
            // InternalSiriusTextDsl.g:140:1: (lv_body_4_0= ruleSiriusFileBody )
            {
            // InternalSiriusTextDsl.g:140:1: (lv_body_4_0= ruleSiriusFileBody )
            // InternalSiriusTextDsl.g:141:3: lv_body_4_0= ruleSiriusFileBody
            {
             
            	        newCompositeNode(grammarAccess.getSiriusFileAccess().getBodySiriusFileBodyParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_body_4_0=ruleSiriusFileBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSiriusFileRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.SiriusFileBody");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSiriusFile"


    // $ANTLR start "entryRuleSiriusFileBody"
    // InternalSiriusTextDsl.g:165:1: entryRuleSiriusFileBody returns [EObject current=null] : iv_ruleSiriusFileBody= ruleSiriusFileBody EOF ;
    public final EObject entryRuleSiriusFileBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiriusFileBody = null;


        try {
            // InternalSiriusTextDsl.g:166:2: (iv_ruleSiriusFileBody= ruleSiriusFileBody EOF )
            // InternalSiriusTextDsl.g:167:2: iv_ruleSiriusFileBody= ruleSiriusFileBody EOF
            {
             newCompositeNode(grammarAccess.getSiriusFileBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiriusFileBody=ruleSiriusFileBody();

            state._fsp--;

             current =iv_ruleSiriusFileBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSiriusFileBody"


    // $ANTLR start "ruleSiriusFileBody"
    // InternalSiriusTextDsl.g:174:1: ruleSiriusFileBody returns [EObject current=null] : (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge | this_Section_7= ruleSection | this_Tool_8= ruleTool ) ;
    public final EObject ruleSiriusFileBody() throws RecognitionException {
        EObject current = null;

        EObject this_Designer_0 = null;

        EObject this_Representation_1 = null;

        EObject this_Layer_2 = null;

        EObject this_Mapping_3 = null;

        EObject this_Style_4 = null;

        EObject this_Palette_5 = null;

        EObject this_Edge_6 = null;

        EObject this_Section_7 = null;

        EObject this_Tool_8 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:177:28: ( (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge | this_Section_7= ruleSection | this_Tool_8= ruleTool ) )
            // InternalSiriusTextDsl.g:178:1: (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge | this_Section_7= ruleSection | this_Tool_8= ruleTool )
            {
            // InternalSiriusTextDsl.g:178:1: (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge | this_Section_7= ruleSection | this_Tool_8= ruleTool )
            int alt3=9;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSiriusTextDsl.g:179:5: this_Designer_0= ruleDesigner
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getDesignerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Designer_0=ruleDesigner();

                    state._fsp--;

                     
                            current = this_Designer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:189:5: this_Representation_1= ruleRepresentation
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getRepresentationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Representation_1=ruleRepresentation();

                    state._fsp--;

                     
                            current = this_Representation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:199:5: this_Layer_2= ruleLayer
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getLayerParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Layer_2=ruleLayer();

                    state._fsp--;

                     
                            current = this_Layer_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:209:5: this_Mapping_3= ruleMapping
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getMappingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Mapping_3=ruleMapping();

                    state._fsp--;

                     
                            current = this_Mapping_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalSiriusTextDsl.g:219:5: this_Style_4= ruleStyle
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getStyleParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Style_4=ruleStyle();

                    state._fsp--;

                     
                            current = this_Style_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalSiriusTextDsl.g:229:5: this_Palette_5= rulePalette
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getPaletteParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Palette_5=rulePalette();

                    state._fsp--;

                     
                            current = this_Palette_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalSiriusTextDsl.g:239:5: this_Edge_6= ruleEdge
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getEdgeParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Edge_6=ruleEdge();

                    state._fsp--;

                     
                            current = this_Edge_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalSiriusTextDsl.g:249:5: this_Section_7= ruleSection
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getSectionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Section_7=ruleSection();

                    state._fsp--;

                     
                            current = this_Section_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalSiriusTextDsl.g:259:5: this_Tool_8= ruleTool
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getToolParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Tool_8=ruleTool();

                    state._fsp--;

                     
                            current = this_Tool_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSiriusFileBody"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSiriusTextDsl.g:275:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSiriusTextDsl.g:276:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSiriusTextDsl.g:277:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSiriusTextDsl.g:284:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:287:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSiriusTextDsl.g:288:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSiriusTextDsl.g:288:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSiriusTextDsl.g:288:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // InternalSiriusTextDsl.g:295:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:296:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,11,FOLLOW_4); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalSiriusTextDsl.g:316:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalSiriusTextDsl.g:317:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalSiriusTextDsl.g:318:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalSiriusTextDsl.g:325:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:328:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalSiriusTextDsl.g:329:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalSiriusTextDsl.g:329:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalSiriusTextDsl.g:330:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_7);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalSiriusTextDsl.g:340:1: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSiriusTextDsl.g:341:2: kw= '.*'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleImport"
    // InternalSiriusTextDsl.g:354:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalSiriusTextDsl.g:355:2: (iv_ruleImport= ruleImport EOF )
            // InternalSiriusTextDsl.g:356:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSiriusTextDsl.g:363:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:366:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalSiriusTextDsl.g:367:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalSiriusTextDsl.g:367:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalSiriusTextDsl.g:367:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // InternalSiriusTextDsl.g:371:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalSiriusTextDsl.g:372:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalSiriusTextDsl.g:372:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalSiriusTextDsl.g:373:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleDesigner"
    // InternalSiriusTextDsl.g:397:1: entryRuleDesigner returns [EObject current=null] : iv_ruleDesigner= ruleDesigner EOF ;
    public final EObject entryRuleDesigner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesigner = null;


        try {
            // InternalSiriusTextDsl.g:398:2: (iv_ruleDesigner= ruleDesigner EOF )
            // InternalSiriusTextDsl.g:399:2: iv_ruleDesigner= ruleDesigner EOF
            {
             newCompositeNode(grammarAccess.getDesignerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDesigner=ruleDesigner();

            state._fsp--;

             current =iv_ruleDesigner; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDesigner"


    // $ANTLR start "ruleDesigner"
    // InternalSiriusTextDsl.g:406:1: ruleDesigner returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' ) ;
    public final EObject ruleDesigner() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_viewpoints_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:409:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' ) )
            // InternalSiriusTextDsl.g:410:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' )
            {
            // InternalSiriusTextDsl.g:410:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' )
            // InternalSiriusTextDsl.g:410:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}'
            {
            // InternalSiriusTextDsl.g:410:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DOCUMENTATION) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSiriusTextDsl.g:411:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:411:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:412:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_8); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getDesignerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDesignerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getDesignerAccess().getDesignerKeyword_1());
                
            // InternalSiriusTextDsl.g:432:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:433:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:433:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:434:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDesignerAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDesignerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:450:2: (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSiriusTextDsl.g:450:4: otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getDesignerAccess().getAsKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:454:1: ( (lv_label_4_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:455:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:455:1: (lv_label_4_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:456:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    			newLeafNode(lv_label_4_0, grammarAccess.getDesignerAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDesignerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_12); 

                	newLeafNode(otherlv_5, grammarAccess.getDesignerAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSiriusTextDsl.g:476:1: ( (lv_viewpoints_6_0= ruleViewpoint ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_DOCUMENTATION||LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:477:1: (lv_viewpoints_6_0= ruleViewpoint )
            	    {
            	    // InternalSiriusTextDsl.g:477:1: (lv_viewpoints_6_0= ruleViewpoint )
            	    // InternalSiriusTextDsl.g:478:3: lv_viewpoints_6_0= ruleViewpoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDesignerAccess().getViewpointsViewpointParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_12);
            	    lv_viewpoints_6_0=ruleViewpoint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDesignerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"viewpoints",
            	            		lv_viewpoints_6_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Viewpoint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getDesignerAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDesigner"


    // $ANTLR start "entryRuleViewpoint"
    // InternalSiriusTextDsl.g:506:1: entryRuleViewpoint returns [EObject current=null] : iv_ruleViewpoint= ruleViewpoint EOF ;
    public final EObject entryRuleViewpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewpoint = null;


        try {
            // InternalSiriusTextDsl.g:507:2: (iv_ruleViewpoint= ruleViewpoint EOF )
            // InternalSiriusTextDsl.g:508:2: iv_ruleViewpoint= ruleViewpoint EOF
            {
             newCompositeNode(grammarAccess.getViewpointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViewpoint=ruleViewpoint();

            state._fsp--;

             current =iv_ruleViewpoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewpoint"


    // $ANTLR start "ruleViewpoint"
    // InternalSiriusTextDsl.g:515:1: ruleViewpoint returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? otherlv_23= '}' ) ;
    public final EObject ruleViewpoint() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_modelFileExtensions_9_0=null;
        Token otherlv_10=null;
        Token lv_modelFileExtensions_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_icon_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:518:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? otherlv_23= '}' ) )
            // InternalSiriusTextDsl.g:519:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? otherlv_23= '}' )
            {
            // InternalSiriusTextDsl.g:519:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? otherlv_23= '}' )
            // InternalSiriusTextDsl.g:519:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? otherlv_23= '}'
            {
            // InternalSiriusTextDsl.g:519:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DOCUMENTATION) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSiriusTextDsl.g:520:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:520:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:521:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_13); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getViewpointAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getViewpointAccess().getViewpointKeyword_1());
                
            // InternalSiriusTextDsl.g:541:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:542:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:542:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:543:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_2_0, grammarAccess.getViewpointAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getViewpointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:559:2: (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSiriusTextDsl.g:559:4: otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getViewpointAccess().getAsKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:563:1: ( (lv_label_4_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:564:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:564:1: (lv_label_4_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:565:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    			newLeafNode(lv_label_4_0, grammarAccess.getViewpointAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_14); 

                	newLeafNode(otherlv_5, grammarAccess.getViewpointAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSiriusTextDsl.g:585:1: (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSiriusTextDsl.g:585:3: otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_15); 

                        	newLeafNode(otherlv_6, grammarAccess.getViewpointAccess().getModelFileExtensionsKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,20,FOLLOW_16); 

                        	newLeafNode(otherlv_7, grammarAccess.getViewpointAccess().getEqualsSignKeyword_5_1());
                        
                    otherlv_8=(Token)match(input,21,FOLLOW_10); 

                        	newLeafNode(otherlv_8, grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_5_2());
                        
                    // InternalSiriusTextDsl.g:597:1: ( (lv_modelFileExtensions_9_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:598:1: (lv_modelFileExtensions_9_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:598:1: (lv_modelFileExtensions_9_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:599:3: lv_modelFileExtensions_9_0= RULE_STRING
                    {
                    lv_modelFileExtensions_9_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    			newLeafNode(lv_modelFileExtensions_9_0, grammarAccess.getViewpointAccess().getModelFileExtensionsSTRINGTerminalRuleCall_5_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"modelFileExtensions",
                            		lv_modelFileExtensions_9_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:615:2: (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==22) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:615:4: otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) )
                    	    {
                    	    otherlv_10=(Token)match(input,22,FOLLOW_10); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getViewpointAccess().getCommaKeyword_5_4_0());
                    	        
                    	    // InternalSiriusTextDsl.g:619:1: ( (lv_modelFileExtensions_11_0= RULE_STRING ) )
                    	    // InternalSiriusTextDsl.g:620:1: (lv_modelFileExtensions_11_0= RULE_STRING )
                    	    {
                    	    // InternalSiriusTextDsl.g:620:1: (lv_modelFileExtensions_11_0= RULE_STRING )
                    	    // InternalSiriusTextDsl.g:621:3: lv_modelFileExtensions_11_0= RULE_STRING
                    	    {
                    	    lv_modelFileExtensions_11_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    	    			newLeafNode(lv_modelFileExtensions_11_0, grammarAccess.getViewpointAccess().getModelFileExtensionsSTRINGTerminalRuleCall_5_4_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"modelFileExtensions",
                    	            		lv_modelFileExtensions_11_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,23,FOLLOW_18); 

                        	newLeafNode(otherlv_12, grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_5_5());
                        

                    }
                    break;

            }

            // InternalSiriusTextDsl.g:641:3: (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSiriusTextDsl.g:641:5: otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_15); 

                        	newLeafNode(otherlv_13, grammarAccess.getViewpointAccess().getIconKeyword_6_0());
                        
                    otherlv_14=(Token)match(input,20,FOLLOW_10); 

                        	newLeafNode(otherlv_14, grammarAccess.getViewpointAccess().getEqualsSignKeyword_6_1());
                        
                    // InternalSiriusTextDsl.g:649:1: ( (lv_icon_15_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:650:1: (lv_icon_15_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:650:1: (lv_icon_15_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:651:3: lv_icon_15_0= RULE_STRING
                    {
                    lv_icon_15_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    			newLeafNode(lv_icon_15_0, grammarAccess.getViewpointAccess().getIconSTRINGTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_15_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:667:4: (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSiriusTextDsl.g:667:6: otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']'
                    {
                    otherlv_16=(Token)match(input,25,FOLLOW_15); 

                        	newLeafNode(otherlv_16, grammarAccess.getViewpointAccess().getRepresentationsKeyword_7_0());
                        
                    otherlv_17=(Token)match(input,20,FOLLOW_16); 

                        	newLeafNode(otherlv_17, grammarAccess.getViewpointAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_18=(Token)match(input,21,FOLLOW_20); 

                        	newLeafNode(otherlv_18, grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_7_2());
                        
                    // InternalSiriusTextDsl.g:679:1: ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalSiriusTextDsl.g:679:2: ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:679:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:680:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:680:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:681:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getViewpointRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getViewpointAccess().getRepresentationsRepresentationCrossReference_7_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_17);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:694:2: (otherlv_20= ',' ( ( ruleQualifiedName ) ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==22) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:694:4: otherlv_20= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_20=(Token)match(input,22,FOLLOW_4); 

                            	        	newLeafNode(otherlv_20, grammarAccess.getViewpointAccess().getCommaKeyword_7_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:698:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:699:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:699:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:700:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getViewpointRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getViewpointAccess().getRepresentationsRepresentationCrossReference_7_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_17);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,23,FOLLOW_21); 

                        	newLeafNode(otherlv_22, grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_23=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_23, grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewpoint"


    // $ANTLR start "entryRuleRepresentation"
    // InternalSiriusTextDsl.g:729:1: entryRuleRepresentation returns [EObject current=null] : iv_ruleRepresentation= ruleRepresentation EOF ;
    public final EObject entryRuleRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepresentation = null;


        try {
            // InternalSiriusTextDsl.g:730:2: (iv_ruleRepresentation= ruleRepresentation EOF )
            // InternalSiriusTextDsl.g:731:2: iv_ruleRepresentation= ruleRepresentation EOF
            {
             newCompositeNode(grammarAccess.getRepresentationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepresentation=ruleRepresentation();

            state._fsp--;

             current =iv_ruleRepresentation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepresentation"


    // $ANTLR start "ruleRepresentation"
    // InternalSiriusTextDsl.g:738:1: ruleRepresentation returns [EObject current=null] : this_Diagram_0= ruleDiagram ;
    public final EObject ruleRepresentation() throws RecognitionException {
        EObject current = null;

        EObject this_Diagram_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:741:28: (this_Diagram_0= ruleDiagram )
            // InternalSiriusTextDsl.g:743:5: this_Diagram_0= ruleDiagram
            {
             
                    newCompositeNode(grammarAccess.getRepresentationAccess().getDiagramParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_Diagram_0=ruleDiagram();

            state._fsp--;

             
                    current = this_Diagram_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepresentation"


    // $ANTLR start "entryRuleDiagram"
    // InternalSiriusTextDsl.g:759:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // InternalSiriusTextDsl.g:760:2: (iv_ruleDiagram= ruleDiagram EOF )
            // InternalSiriusTextDsl.g:761:2: iv_ruleDiagram= ruleDiagram EOF
            {
             newCompositeNode(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;

             current =iv_ruleDiagram; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // InternalSiriusTextDsl.g:768:1: ruleDiagram returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token lv_initialized_1_0=null;
        Token lv_showOnStartup_2_0=null;
        Token lv_enablePopupBars_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_metamodelUris_6_0=null;
        Token otherlv_7=null;
        Token lv_metamodelUris_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_name_11_0=null;
        Token otherlv_12=null;
        Token lv_label_13_0=null;
        Token otherlv_14=null;
        Token lv_domainClass_15_0=null;
        Token otherlv_16=null;
        Token lv_precondition_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_endUserDocumentation_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_titleExpression_24_0=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_rootExpression_27_0=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:771:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' ) )
            // InternalSiriusTextDsl.g:772:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' )
            {
            // InternalSiriusTextDsl.g:772:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' )
            // InternalSiriusTextDsl.g:772:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}'
            {
            // InternalSiriusTextDsl.g:772:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_DOCUMENTATION) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSiriusTextDsl.g:773:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:773:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:774:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_22); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getDiagramAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:790:3: ( (lv_initialized_1_0= '@Initialized' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSiriusTextDsl.g:791:1: (lv_initialized_1_0= '@Initialized' )
                    {
                    // InternalSiriusTextDsl.g:791:1: (lv_initialized_1_0= '@Initialized' )
                    // InternalSiriusTextDsl.g:792:3: lv_initialized_1_0= '@Initialized'
                    {
                    lv_initialized_1_0=(Token)match(input,26,FOLLOW_23); 

                            newLeafNode(lv_initialized_1_0, grammarAccess.getDiagramAccess().getInitializedInitializedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(current, "initialized", true, "@Initialized");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:805:3: ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSiriusTextDsl.g:806:1: (lv_showOnStartup_2_0= '@ShowOnStartup' )
                    {
                    // InternalSiriusTextDsl.g:806:1: (lv_showOnStartup_2_0= '@ShowOnStartup' )
                    // InternalSiriusTextDsl.g:807:3: lv_showOnStartup_2_0= '@ShowOnStartup'
                    {
                    lv_showOnStartup_2_0=(Token)match(input,27,FOLLOW_24); 

                            newLeafNode(lv_showOnStartup_2_0, grammarAccess.getDiagramAccess().getShowOnStartupShowOnStartupKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(current, "showOnStartup", true, "@ShowOnStartup");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:820:3: ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSiriusTextDsl.g:821:1: (lv_enablePopupBars_3_0= '@EnablePopupBars' )
                    {
                    // InternalSiriusTextDsl.g:821:1: (lv_enablePopupBars_3_0= '@EnablePopupBars' )
                    // InternalSiriusTextDsl.g:822:3: lv_enablePopupBars_3_0= '@EnablePopupBars'
                    {
                    lv_enablePopupBars_3_0=(Token)match(input,28,FOLLOW_25); 

                            newLeafNode(lv_enablePopupBars_3_0, grammarAccess.getDiagramAccess().getEnablePopupBarsEnablePopupBarsKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(current, "enablePopupBars", true, "@EnablePopupBars");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:835:3: (otherlv_4= '@MetamodelUris' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:835:5: otherlv_4= '@MetamodelUris'
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_26); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDiagramAccess().getMetamodelUrisKeyword_4());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_5=(Token)match(input,30,FOLLOW_10); 

                	newLeafNode(otherlv_5, grammarAccess.getDiagramAccess().getLeftParenthesisLeftCurlyBracketKeyword_5());
                
            // InternalSiriusTextDsl.g:843:1: ( (lv_metamodelUris_6_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:844:1: (lv_metamodelUris_6_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:844:1: (lv_metamodelUris_6_0= RULE_STRING )
            // InternalSiriusTextDsl.g:845:3: lv_metamodelUris_6_0= RULE_STRING
            {
            lv_metamodelUris_6_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            			newLeafNode(lv_metamodelUris_6_0, grammarAccess.getDiagramAccess().getMetamodelUrisSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"metamodelUris",
                    		lv_metamodelUris_6_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:861:2: (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:861:4: otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_10); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDiagramAccess().getCommaKeyword_7_0());
            	        
            	    // InternalSiriusTextDsl.g:865:1: ( (lv_metamodelUris_8_0= RULE_STRING ) )
            	    // InternalSiriusTextDsl.g:866:1: (lv_metamodelUris_8_0= RULE_STRING )
            	    {
            	    // InternalSiriusTextDsl.g:866:1: (lv_metamodelUris_8_0= RULE_STRING )
            	    // InternalSiriusTextDsl.g:867:3: lv_metamodelUris_8_0= RULE_STRING
            	    {
            	    lv_metamodelUris_8_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            	    			newLeafNode(lv_metamodelUris_8_0, grammarAccess.getDiagramAccess().getMetamodelUrisSTRINGTerminalRuleCall_7_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDiagramRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"metamodelUris",
            	            		lv_metamodelUris_8_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_9=(Token)match(input,31,FOLLOW_28); 

                	newLeafNode(otherlv_9, grammarAccess.getDiagramAccess().getRightCurlyBracketRightParenthesisKeyword_8());
                
            otherlv_10=(Token)match(input,32,FOLLOW_4); 

                	newLeafNode(otherlv_10, grammarAccess.getDiagramAccess().getDiagramKeyword_9());
                
            // InternalSiriusTextDsl.g:891:1: ( (lv_name_11_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:892:1: (lv_name_11_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:892:1: (lv_name_11_0= RULE_ID )
            // InternalSiriusTextDsl.g:893:3: lv_name_11_0= RULE_ID
            {
            lv_name_11_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            			newLeafNode(lv_name_11_0, grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_11_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:909:2: (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==15) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSiriusTextDsl.g:909:4: otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_12, grammarAccess.getDiagramAccess().getAsKeyword_11_0());
                        
                    // InternalSiriusTextDsl.g:913:1: ( (lv_label_13_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:914:1: (lv_label_13_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:914:1: (lv_label_13_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:915:3: lv_label_13_0= RULE_STRING
                    {
                    lv_label_13_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    			newLeafNode(lv_label_13_0, grammarAccess.getDiagramAccess().getLabelSTRINGTerminalRuleCall_11_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_13_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,33,FOLLOW_10); 

                	newLeafNode(otherlv_14, grammarAccess.getDiagramAccess().getForKeyword_12());
                
            // InternalSiriusTextDsl.g:935:1: ( (lv_domainClass_15_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:936:1: (lv_domainClass_15_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:936:1: (lv_domainClass_15_0= RULE_STRING )
            // InternalSiriusTextDsl.g:937:3: lv_domainClass_15_0= RULE_STRING
            {
            lv_domainClass_15_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            			newLeafNode(lv_domainClass_15_0, grammarAccess.getDiagramAccess().getDomainClassSTRINGTerminalRuleCall_13_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"domainClass",
                    		lv_domainClass_15_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:953:2: (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSiriusTextDsl.g:953:4: otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) )
                    {
                    otherlv_16=(Token)match(input,34,FOLLOW_32); 

                        	newLeafNode(otherlv_16, grammarAccess.getDiagramAccess().getQuestionMarkKeyword_14_0());
                        
                    // InternalSiriusTextDsl.g:957:1: ( (lv_precondition_17_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:958:1: (lv_precondition_17_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:958:1: (lv_precondition_17_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:959:3: lv_precondition_17_0= RULE_EXPRESSION
                    {
                    lv_precondition_17_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_11); 

                    			newLeafNode(lv_precondition_17_0, grammarAccess.getDiagramAccess().getPreconditionEXPRESSIONTerminalRuleCall_14_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"precondition",
                            		lv_precondition_17_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,16,FOLLOW_33); 

                	newLeafNode(otherlv_18, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_15());
                
            // InternalSiriusTextDsl.g:979:1: (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSiriusTextDsl.g:979:3: otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) )
                    {
                    otherlv_19=(Token)match(input,35,FOLLOW_15); 

                        	newLeafNode(otherlv_19, grammarAccess.getDiagramAccess().getDocumentationKeyword_16_0());
                        
                    otherlv_20=(Token)match(input,20,FOLLOW_10); 

                        	newLeafNode(otherlv_20, grammarAccess.getDiagramAccess().getEqualsSignKeyword_16_1());
                        
                    // InternalSiriusTextDsl.g:987:1: ( (lv_endUserDocumentation_21_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:988:1: (lv_endUserDocumentation_21_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:988:1: (lv_endUserDocumentation_21_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:989:3: lv_endUserDocumentation_21_0= RULE_STRING
                    {
                    lv_endUserDocumentation_21_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

                    			newLeafNode(lv_endUserDocumentation_21_0, grammarAccess.getDiagramAccess().getEndUserDocumentationSTRINGTerminalRuleCall_16_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"endUserDocumentation",
                            		lv_endUserDocumentation_21_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1005:4: (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSiriusTextDsl.g:1005:6: otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) )
                    {
                    otherlv_22=(Token)match(input,36,FOLLOW_15); 

                        	newLeafNode(otherlv_22, grammarAccess.getDiagramAccess().getTitleExpressionKeyword_17_0());
                        
                    otherlv_23=(Token)match(input,20,FOLLOW_32); 

                        	newLeafNode(otherlv_23, grammarAccess.getDiagramAccess().getEqualsSignKeyword_17_1());
                        
                    // InternalSiriusTextDsl.g:1013:1: ( (lv_titleExpression_24_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1014:1: (lv_titleExpression_24_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1014:1: (lv_titleExpression_24_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1015:3: lv_titleExpression_24_0= RULE_EXPRESSION
                    {
                    lv_titleExpression_24_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_35); 

                    			newLeafNode(lv_titleExpression_24_0, grammarAccess.getDiagramAccess().getTitleExpressionEXPRESSIONTerminalRuleCall_17_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"titleExpression",
                            		lv_titleExpression_24_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1031:4: (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSiriusTextDsl.g:1031:6: otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) )
                    {
                    otherlv_25=(Token)match(input,37,FOLLOW_15); 

                        	newLeafNode(otherlv_25, grammarAccess.getDiagramAccess().getRootExpressionKeyword_18_0());
                        
                    otherlv_26=(Token)match(input,20,FOLLOW_32); 

                        	newLeafNode(otherlv_26, grammarAccess.getDiagramAccess().getEqualsSignKeyword_18_1());
                        
                    // InternalSiriusTextDsl.g:1039:1: ( (lv_rootExpression_27_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1040:1: (lv_rootExpression_27_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1040:1: (lv_rootExpression_27_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1041:3: lv_rootExpression_27_0= RULE_EXPRESSION
                    {
                    lv_rootExpression_27_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_36); 

                    			newLeafNode(lv_rootExpression_27_0, grammarAccess.getDiagramAccess().getRootExpressionEXPRESSIONTerminalRuleCall_18_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rootExpression",
                            		lv_rootExpression_27_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1057:4: (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSiriusTextDsl.g:1057:6: otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) )
                    {
                    otherlv_28=(Token)match(input,38,FOLLOW_15); 

                        	newLeafNode(otherlv_28, grammarAccess.getDiagramAccess().getDefaultLayerKeyword_19_0());
                        
                    otherlv_29=(Token)match(input,20,FOLLOW_4); 

                        	newLeafNode(otherlv_29, grammarAccess.getDiagramAccess().getEqualsSignKeyword_19_1());
                        
                    // InternalSiriusTextDsl.g:1065:1: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:1066:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:1066:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:1067:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDiagramAccess().getDefaultLayerLayerCrossReference_19_2_0()); 
                    	    
                    pushFollow(FOLLOW_37);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1080:4: (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSiriusTextDsl.g:1080:6: otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']'
                    {
                    otherlv_31=(Token)match(input,39,FOLLOW_15); 

                        	newLeafNode(otherlv_31, grammarAccess.getDiagramAccess().getAdditionalLayersKeyword_20_0());
                        
                    otherlv_32=(Token)match(input,20,FOLLOW_16); 

                        	newLeafNode(otherlv_32, grammarAccess.getDiagramAccess().getEqualsSignKeyword_20_1());
                        
                    otherlv_33=(Token)match(input,21,FOLLOW_20); 

                        	newLeafNode(otherlv_33, grammarAccess.getDiagramAccess().getLeftSquareBracketKeyword_20_2());
                        
                    // InternalSiriusTextDsl.g:1092:1: ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_ID) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1092:2: ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1092:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1093:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1093:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1094:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getDiagramRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getDiagramAccess().getAdditionalLayersLayerCrossReference_20_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_17);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1107:2: (otherlv_35= ',' ( ( ruleQualifiedName ) ) )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==22) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1107:4: otherlv_35= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_35=(Token)match(input,22,FOLLOW_4); 

                            	        	newLeafNode(otherlv_35, grammarAccess.getDiagramAccess().getCommaKeyword_20_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1111:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1112:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1112:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1113:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getDiagramRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getAdditionalLayersLayerCrossReference_20_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_17);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop29;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_37=(Token)match(input,23,FOLLOW_21); 

                        	newLeafNode(otherlv_37, grammarAccess.getDiagramAccess().getRightSquareBracketKeyword_20_4());
                        

                    }
                    break;

            }

            otherlv_38=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_38, grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_21());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleLayer"
    // InternalSiriusTextDsl.g:1142:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalSiriusTextDsl.g:1143:2: (iv_ruleLayer= ruleLayer EOF )
            // InternalSiriusTextDsl.g:1144:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalSiriusTextDsl.g:1151:1: ruleLayer returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? (otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' )? (otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' )? (otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']' )? otherlv_28= '}' ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_icon_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1154:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? (otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' )? (otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' )? (otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']' )? otherlv_28= '}' ) )
            // InternalSiriusTextDsl.g:1155:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? (otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' )? (otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' )? (otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']' )? otherlv_28= '}' )
            {
            // InternalSiriusTextDsl.g:1155:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? (otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' )? (otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' )? (otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']' )? otherlv_28= '}' )
            // InternalSiriusTextDsl.g:1155:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? (otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' )? (otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' )? (otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']' )? otherlv_28= '}'
            {
            // InternalSiriusTextDsl.g:1155:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_DOCUMENTATION) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSiriusTextDsl.g:1156:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:1156:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:1157:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_38); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getLayerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,40,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getLayerAccess().getLayerKeyword_1());
                
            // InternalSiriusTextDsl.g:1177:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:1178:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:1178:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:1179:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			newLeafNode(lv_name_2_0, grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLayerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_39); 

                	newLeafNode(otherlv_3, grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalSiriusTextDsl.g:1199:1: (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==24) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSiriusTextDsl.g:1199:3: otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_15); 

                        	newLeafNode(otherlv_4, grammarAccess.getLayerAccess().getIconKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,20,FOLLOW_10); 

                        	newLeafNode(otherlv_5, grammarAccess.getLayerAccess().getEqualsSignKeyword_4_1());
                        
                    // InternalSiriusTextDsl.g:1207:1: ( (lv_icon_6_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1208:1: (lv_icon_6_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1208:1: (lv_icon_6_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1209:3: lv_icon_6_0= RULE_STRING
                    {
                    lv_icon_6_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    			newLeafNode(lv_icon_6_0, grammarAccess.getLayerAccess().getIconSTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_6_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1225:4: (otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSiriusTextDsl.g:1225:6: otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']'
                    {
                    otherlv_7=(Token)match(input,41,FOLLOW_15); 

                        	newLeafNode(otherlv_7, grammarAccess.getLayerAccess().getMappingsKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,20,FOLLOW_16); 

                        	newLeafNode(otherlv_8, grammarAccess.getLayerAccess().getEqualsSignKeyword_5_1());
                        
                    otherlv_9=(Token)match(input,21,FOLLOW_20); 

                        	newLeafNode(otherlv_9, grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_5_2());
                        
                    // InternalSiriusTextDsl.g:1237:1: ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1237:2: ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1237:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1238:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1238:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1239:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getLayerRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_5_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_17);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1252:2: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==22) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1252:4: otherlv_11= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_11=(Token)match(input,22,FOLLOW_4); 

                            	        	newLeafNode(otherlv_11, grammarAccess.getLayerAccess().getCommaKeyword_5_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1256:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1257:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1257:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1258:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getLayerRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_5_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_17);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,23,FOLLOW_41); 

                        	newLeafNode(otherlv_13, grammarAccess.getLayerAccess().getRightSquareBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1275:3: (otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==42) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSiriusTextDsl.g:1275:5: otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']'
                    {
                    otherlv_14=(Token)match(input,42,FOLLOW_15); 

                        	newLeafNode(otherlv_14, grammarAccess.getLayerAccess().getEdgesKeyword_6_0());
                        
                    otherlv_15=(Token)match(input,20,FOLLOW_16); 

                        	newLeafNode(otherlv_15, grammarAccess.getLayerAccess().getEqualsSignKeyword_6_1());
                        
                    otherlv_16=(Token)match(input,21,FOLLOW_20); 

                        	newLeafNode(otherlv_16, grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_6_2());
                        
                    // InternalSiriusTextDsl.g:1287:1: ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_ID) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1287:2: ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1287:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1288:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1288:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1289:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getLayerRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getLayerAccess().getEdgesEdgeCrossReference_6_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_17);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1302:2: (otherlv_18= ',' ( ( ruleQualifiedName ) ) )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==22) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1302:4: otherlv_18= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_18=(Token)match(input,22,FOLLOW_4); 

                            	        	newLeafNode(otherlv_18, grammarAccess.getLayerAccess().getCommaKeyword_6_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1306:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1307:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1307:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1308:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getLayerRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getLayerAccess().getEdgesEdgeCrossReference_6_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_17);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop37;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_20=(Token)match(input,23,FOLLOW_42); 

                        	newLeafNode(otherlv_20, grammarAccess.getLayerAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1325:3: (otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==43) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSiriusTextDsl.g:1325:5: otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']'
                    {
                    otherlv_21=(Token)match(input,43,FOLLOW_15); 

                        	newLeafNode(otherlv_21, grammarAccess.getLayerAccess().getSectionsKeyword_7_0());
                        
                    otherlv_22=(Token)match(input,20,FOLLOW_16); 

                        	newLeafNode(otherlv_22, grammarAccess.getLayerAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_23=(Token)match(input,21,FOLLOW_20); 

                        	newLeafNode(otherlv_23, grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_7_2());
                        
                    // InternalSiriusTextDsl.g:1337:1: ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1337:2: ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1337:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1338:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1338:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1339:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getLayerRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getLayerAccess().getSectionsSectionCrossReference_7_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_17);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1352:2: (otherlv_25= ',' ( ( ruleQualifiedName ) ) )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==22) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1352:4: otherlv_25= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_25=(Token)match(input,22,FOLLOW_4); 

                            	        	newLeafNode(otherlv_25, grammarAccess.getLayerAccess().getCommaKeyword_7_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1356:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1357:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1357:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1358:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getLayerRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getLayerAccess().getSectionsSectionCrossReference_7_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_17);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop40;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_27=(Token)match(input,23,FOLLOW_21); 

                        	newLeafNode(otherlv_27, grammarAccess.getLayerAccess().getRightSquareBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_28=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_28, grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleSection"
    // InternalSiriusTextDsl.g:1387:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalSiriusTextDsl.g:1388:2: (iv_ruleSection= ruleSection EOF )
            // InternalSiriusTextDsl.g:1389:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalSiriusTextDsl.g:1396:1: ruleSection returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'icon' otherlv_7= '=' ( (lv_icon_8_0= RULE_STRING ) ) )? (otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']' )? otherlv_16= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_icon_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1399:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'icon' otherlv_7= '=' ( (lv_icon_8_0= RULE_STRING ) ) )? (otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']' )? otherlv_16= '}' ) )
            // InternalSiriusTextDsl.g:1400:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'icon' otherlv_7= '=' ( (lv_icon_8_0= RULE_STRING ) ) )? (otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']' )? otherlv_16= '}' )
            {
            // InternalSiriusTextDsl.g:1400:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'icon' otherlv_7= '=' ( (lv_icon_8_0= RULE_STRING ) ) )? (otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']' )? otherlv_16= '}' )
            // InternalSiriusTextDsl.g:1400:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'section' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'icon' otherlv_7= '=' ( (lv_icon_8_0= RULE_STRING ) ) )? (otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']' )? otherlv_16= '}'
            {
            // InternalSiriusTextDsl.g:1400:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_DOCUMENTATION) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSiriusTextDsl.g:1401:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:1401:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:1402:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_43); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getSectionAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,44,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionKeyword_1());
                
            // InternalSiriusTextDsl.g:1422:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:1423:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:1423:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:1424:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:1440:2: (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==15) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSiriusTextDsl.g:1440:4: otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getAsKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:1444:1: ( (lv_label_4_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1445:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1445:1: (lv_label_4_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1446:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    			newLeafNode(lv_label_4_0, grammarAccess.getSectionAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_44); 

                	newLeafNode(otherlv_5, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSiriusTextDsl.g:1466:1: (otherlv_6= 'icon' otherlv_7= '=' ( (lv_icon_8_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==24) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSiriusTextDsl.g:1466:3: otherlv_6= 'icon' otherlv_7= '=' ( (lv_icon_8_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_15); 

                        	newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getIconKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,20,FOLLOW_10); 

                        	newLeafNode(otherlv_7, grammarAccess.getSectionAccess().getEqualsSignKeyword_5_1());
                        
                    // InternalSiriusTextDsl.g:1474:1: ( (lv_icon_8_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1475:1: (lv_icon_8_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1475:1: (lv_icon_8_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1476:3: lv_icon_8_0= RULE_STRING
                    {
                    lv_icon_8_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

                    			newLeafNode(lv_icon_8_0, grammarAccess.getSectionAccess().getIconSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_8_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1492:4: (otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==45) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSiriusTextDsl.g:1492:6: otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']'
                    {
                    otherlv_9=(Token)match(input,45,FOLLOW_15); 

                        	newLeafNode(otherlv_9, grammarAccess.getSectionAccess().getToolsKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,20,FOLLOW_16); 

                        	newLeafNode(otherlv_10, grammarAccess.getSectionAccess().getEqualsSignKeyword_6_1());
                        
                    otherlv_11=(Token)match(input,21,FOLLOW_20); 

                        	newLeafNode(otherlv_11, grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_6_2());
                        
                    // InternalSiriusTextDsl.g:1504:1: ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1504:2: ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1504:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1505:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1505:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1506:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getSectionRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getSectionAccess().getToolsToolCrossReference_6_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_17);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1519:2: (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                            loop46:
                            do {
                                int alt46=2;
                                int LA46_0 = input.LA(1);

                                if ( (LA46_0==22) ) {
                                    alt46=1;
                                }


                                switch (alt46) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1519:4: otherlv_13= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_13=(Token)match(input,22,FOLLOW_4); 

                            	        	newLeafNode(otherlv_13, grammarAccess.getSectionAccess().getCommaKeyword_6_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1523:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1524:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1524:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1525:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getSectionRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getSectionAccess().getToolsToolCrossReference_6_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_17);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop46;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,23,FOLLOW_21); 

                        	newLeafNode(otherlv_15, grammarAccess.getSectionAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_16, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleTool"
    // InternalSiriusTextDsl.g:1554:1: entryRuleTool returns [EObject current=null] : iv_ruleTool= ruleTool EOF ;
    public final EObject entryRuleTool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTool = null;


        try {
            // InternalSiriusTextDsl.g:1555:2: (iv_ruleTool= ruleTool EOF )
            // InternalSiriusTextDsl.g:1556:2: iv_ruleTool= ruleTool EOF
            {
             newCompositeNode(grammarAccess.getToolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTool=ruleTool();

            state._fsp--;

             current =iv_ruleTool; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTool"


    // $ANTLR start "ruleTool"
    // InternalSiriusTextDsl.g:1563:1: ruleTool returns [EObject current=null] : this_ContainerCreation_0= ruleContainerCreation ;
    public final EObject ruleTool() throws RecognitionException {
        EObject current = null;

        EObject this_ContainerCreation_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1566:28: (this_ContainerCreation_0= ruleContainerCreation )
            // InternalSiriusTextDsl.g:1568:5: this_ContainerCreation_0= ruleContainerCreation
            {
             
                    newCompositeNode(grammarAccess.getToolAccess().getContainerCreationParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_ContainerCreation_0=ruleContainerCreation();

            state._fsp--;

             
                    current = this_ContainerCreation_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTool"


    // $ANTLR start "entryRuleContainerCreation"
    // InternalSiriusTextDsl.g:1584:1: entryRuleContainerCreation returns [EObject current=null] : iv_ruleContainerCreation= ruleContainerCreation EOF ;
    public final EObject entryRuleContainerCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerCreation = null;


        try {
            // InternalSiriusTextDsl.g:1585:2: (iv_ruleContainerCreation= ruleContainerCreation EOF )
            // InternalSiriusTextDsl.g:1586:2: iv_ruleContainerCreation= ruleContainerCreation EOF
            {
             newCompositeNode(grammarAccess.getContainerCreationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainerCreation=ruleContainerCreation();

            state._fsp--;

             current =iv_ruleContainerCreation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerCreation"


    // $ANTLR start "ruleContainerCreation"
    // InternalSiriusTextDsl.g:1593:1: ruleContainerCreation returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_forceRefresh_1_0= '@ForceRefresh' ) )? otherlv_2= '@NodeCreationVariable' otherlv_3= '(' ( (lv_nodeCreationVariable_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '@ContainerViewVariable' otherlv_7= '(' ( (lv_containerViewVariable_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'containerCreation' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? (otherlv_14= '?' ( (lv_precondition_15_0= RULE_EXPRESSION ) ) )? otherlv_16= '{' (otherlv_17= 'icon' otherlv_18= '=' ( (lv_icon_19_0= RULE_STRING ) ) )? otherlv_20= 'containerMappings' otherlv_21= '=' otherlv_22= '[' ( ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_26= ']' (otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']' )? otherlv_34= 'begin' otherlv_35= '{' ( (lv_body_36_0= ruleOperation ) )? otherlv_37= '}' otherlv_38= '}' ) ;
    public final EObject ruleContainerCreation() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token lv_forceRefresh_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nodeCreationVariable_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_containerViewVariable_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_name_11_0=null;
        Token otherlv_12=null;
        Token lv_label_13_0=null;
        Token otherlv_14=null;
        Token lv_precondition_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_icon_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        EObject lv_body_36_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1596:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_forceRefresh_1_0= '@ForceRefresh' ) )? otherlv_2= '@NodeCreationVariable' otherlv_3= '(' ( (lv_nodeCreationVariable_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '@ContainerViewVariable' otherlv_7= '(' ( (lv_containerViewVariable_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'containerCreation' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? (otherlv_14= '?' ( (lv_precondition_15_0= RULE_EXPRESSION ) ) )? otherlv_16= '{' (otherlv_17= 'icon' otherlv_18= '=' ( (lv_icon_19_0= RULE_STRING ) ) )? otherlv_20= 'containerMappings' otherlv_21= '=' otherlv_22= '[' ( ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_26= ']' (otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']' )? otherlv_34= 'begin' otherlv_35= '{' ( (lv_body_36_0= ruleOperation ) )? otherlv_37= '}' otherlv_38= '}' ) )
            // InternalSiriusTextDsl.g:1597:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_forceRefresh_1_0= '@ForceRefresh' ) )? otherlv_2= '@NodeCreationVariable' otherlv_3= '(' ( (lv_nodeCreationVariable_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '@ContainerViewVariable' otherlv_7= '(' ( (lv_containerViewVariable_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'containerCreation' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? (otherlv_14= '?' ( (lv_precondition_15_0= RULE_EXPRESSION ) ) )? otherlv_16= '{' (otherlv_17= 'icon' otherlv_18= '=' ( (lv_icon_19_0= RULE_STRING ) ) )? otherlv_20= 'containerMappings' otherlv_21= '=' otherlv_22= '[' ( ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_26= ']' (otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']' )? otherlv_34= 'begin' otherlv_35= '{' ( (lv_body_36_0= ruleOperation ) )? otherlv_37= '}' otherlv_38= '}' )
            {
            // InternalSiriusTextDsl.g:1597:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_forceRefresh_1_0= '@ForceRefresh' ) )? otherlv_2= '@NodeCreationVariable' otherlv_3= '(' ( (lv_nodeCreationVariable_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '@ContainerViewVariable' otherlv_7= '(' ( (lv_containerViewVariable_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'containerCreation' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? (otherlv_14= '?' ( (lv_precondition_15_0= RULE_EXPRESSION ) ) )? otherlv_16= '{' (otherlv_17= 'icon' otherlv_18= '=' ( (lv_icon_19_0= RULE_STRING ) ) )? otherlv_20= 'containerMappings' otherlv_21= '=' otherlv_22= '[' ( ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_26= ']' (otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']' )? otherlv_34= 'begin' otherlv_35= '{' ( (lv_body_36_0= ruleOperation ) )? otherlv_37= '}' otherlv_38= '}' )
            // InternalSiriusTextDsl.g:1597:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_forceRefresh_1_0= '@ForceRefresh' ) )? otherlv_2= '@NodeCreationVariable' otherlv_3= '(' ( (lv_nodeCreationVariable_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= '@ContainerViewVariable' otherlv_7= '(' ( (lv_containerViewVariable_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'containerCreation' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? (otherlv_14= '?' ( (lv_precondition_15_0= RULE_EXPRESSION ) ) )? otherlv_16= '{' (otherlv_17= 'icon' otherlv_18= '=' ( (lv_icon_19_0= RULE_STRING ) ) )? otherlv_20= 'containerMappings' otherlv_21= '=' otherlv_22= '[' ( ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_26= ']' (otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']' )? otherlv_34= 'begin' otherlv_35= '{' ( (lv_body_36_0= ruleOperation ) )? otherlv_37= '}' otherlv_38= '}'
            {
            // InternalSiriusTextDsl.g:1597:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_DOCUMENTATION) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSiriusTextDsl.g:1598:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:1598:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:1599:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_46); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getContainerCreationAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1615:3: ( (lv_forceRefresh_1_0= '@ForceRefresh' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==46) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSiriusTextDsl.g:1616:1: (lv_forceRefresh_1_0= '@ForceRefresh' )
                    {
                    // InternalSiriusTextDsl.g:1616:1: (lv_forceRefresh_1_0= '@ForceRefresh' )
                    // InternalSiriusTextDsl.g:1617:3: lv_forceRefresh_1_0= '@ForceRefresh'
                    {
                    lv_forceRefresh_1_0=(Token)match(input,46,FOLLOW_47); 

                            newLeafNode(lv_forceRefresh_1_0, grammarAccess.getContainerCreationAccess().getForceRefreshForceRefreshKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	        }
                           		setWithLastConsumed(current, "forceRefresh", true, "@ForceRefresh");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,47,FOLLOW_48); 

                	newLeafNode(otherlv_2, grammarAccess.getContainerCreationAccess().getNodeCreationVariableKeyword_2());
                
            otherlv_3=(Token)match(input,48,FOLLOW_10); 

                	newLeafNode(otherlv_3, grammarAccess.getContainerCreationAccess().getLeftParenthesisKeyword_3());
                
            // InternalSiriusTextDsl.g:1638:1: ( (lv_nodeCreationVariable_4_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:1639:1: (lv_nodeCreationVariable_4_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:1639:1: (lv_nodeCreationVariable_4_0= RULE_STRING )
            // InternalSiriusTextDsl.g:1640:3: lv_nodeCreationVariable_4_0= RULE_STRING
            {
            lv_nodeCreationVariable_4_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

            			newLeafNode(lv_nodeCreationVariable_4_0, grammarAccess.getContainerCreationAccess().getNodeCreationVariableSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerCreationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nodeCreationVariable",
                    		lv_nodeCreationVariable_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,49,FOLLOW_50); 

                	newLeafNode(otherlv_5, grammarAccess.getContainerCreationAccess().getRightParenthesisKeyword_5());
                
            otherlv_6=(Token)match(input,50,FOLLOW_48); 

                	newLeafNode(otherlv_6, grammarAccess.getContainerCreationAccess().getContainerViewVariableKeyword_6());
                
            otherlv_7=(Token)match(input,48,FOLLOW_10); 

                	newLeafNode(otherlv_7, grammarAccess.getContainerCreationAccess().getLeftParenthesisKeyword_7());
                
            // InternalSiriusTextDsl.g:1668:1: ( (lv_containerViewVariable_8_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:1669:1: (lv_containerViewVariable_8_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:1669:1: (lv_containerViewVariable_8_0= RULE_STRING )
            // InternalSiriusTextDsl.g:1670:3: lv_containerViewVariable_8_0= RULE_STRING
            {
            lv_containerViewVariable_8_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

            			newLeafNode(lv_containerViewVariable_8_0, grammarAccess.getContainerCreationAccess().getContainerViewVariableSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerCreationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"containerViewVariable",
                    		lv_containerViewVariable_8_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,49,FOLLOW_51); 

                	newLeafNode(otherlv_9, grammarAccess.getContainerCreationAccess().getRightParenthesisKeyword_9());
                
            otherlv_10=(Token)match(input,51,FOLLOW_4); 

                	newLeafNode(otherlv_10, grammarAccess.getContainerCreationAccess().getContainerCreationKeyword_10());
                
            // InternalSiriusTextDsl.g:1694:1: ( (lv_name_11_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:1695:1: (lv_name_11_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:1695:1: (lv_name_11_0= RULE_ID )
            // InternalSiriusTextDsl.g:1696:3: lv_name_11_0= RULE_ID
            {
            lv_name_11_0=(Token)match(input,RULE_ID,FOLLOW_52); 

            			newLeafNode(lv_name_11_0, grammarAccess.getContainerCreationAccess().getNameIDTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerCreationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_11_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:1712:2: (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==15) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSiriusTextDsl.g:1712:4: otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_12, grammarAccess.getContainerCreationAccess().getAsKeyword_12_0());
                        
                    // InternalSiriusTextDsl.g:1716:1: ( (lv_label_13_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1717:1: (lv_label_13_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1717:1: (lv_label_13_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1718:3: lv_label_13_0= RULE_STRING
                    {
                    lv_label_13_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

                    			newLeafNode(lv_label_13_0, grammarAccess.getContainerCreationAccess().getLabelSTRINGTerminalRuleCall_12_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_13_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1734:4: (otherlv_14= '?' ( (lv_precondition_15_0= RULE_EXPRESSION ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==34) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSiriusTextDsl.g:1734:6: otherlv_14= '?' ( (lv_precondition_15_0= RULE_EXPRESSION ) )
                    {
                    otherlv_14=(Token)match(input,34,FOLLOW_32); 

                        	newLeafNode(otherlv_14, grammarAccess.getContainerCreationAccess().getQuestionMarkKeyword_13_0());
                        
                    // InternalSiriusTextDsl.g:1738:1: ( (lv_precondition_15_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1739:1: (lv_precondition_15_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1739:1: (lv_precondition_15_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1740:3: lv_precondition_15_0= RULE_EXPRESSION
                    {
                    lv_precondition_15_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_11); 

                    			newLeafNode(lv_precondition_15_0, grammarAccess.getContainerCreationAccess().getPreconditionEXPRESSIONTerminalRuleCall_13_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"precondition",
                            		lv_precondition_15_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FOLLOW_53); 

                	newLeafNode(otherlv_16, grammarAccess.getContainerCreationAccess().getLeftCurlyBracketKeyword_14());
                
            // InternalSiriusTextDsl.g:1760:1: (otherlv_17= 'icon' otherlv_18= '=' ( (lv_icon_19_0= RULE_STRING ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==24) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSiriusTextDsl.g:1760:3: otherlv_17= 'icon' otherlv_18= '=' ( (lv_icon_19_0= RULE_STRING ) )
                    {
                    otherlv_17=(Token)match(input,24,FOLLOW_15); 

                        	newLeafNode(otherlv_17, grammarAccess.getContainerCreationAccess().getIconKeyword_15_0());
                        
                    otherlv_18=(Token)match(input,20,FOLLOW_10); 

                        	newLeafNode(otherlv_18, grammarAccess.getContainerCreationAccess().getEqualsSignKeyword_15_1());
                        
                    // InternalSiriusTextDsl.g:1768:1: ( (lv_icon_19_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1769:1: (lv_icon_19_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1769:1: (lv_icon_19_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1770:3: lv_icon_19_0= RULE_STRING
                    {
                    lv_icon_19_0=(Token)match(input,RULE_STRING,FOLLOW_54); 

                    			newLeafNode(lv_icon_19_0, grammarAccess.getContainerCreationAccess().getIconSTRINGTerminalRuleCall_15_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_19_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,52,FOLLOW_15); 

                	newLeafNode(otherlv_20, grammarAccess.getContainerCreationAccess().getContainerMappingsKeyword_16());
                
            otherlv_21=(Token)match(input,20,FOLLOW_16); 

                	newLeafNode(otherlv_21, grammarAccess.getContainerCreationAccess().getEqualsSignKeyword_17());
                
            otherlv_22=(Token)match(input,21,FOLLOW_20); 

                	newLeafNode(otherlv_22, grammarAccess.getContainerCreationAccess().getLeftSquareBracketKeyword_18());
                
            // InternalSiriusTextDsl.g:1798:1: ( ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSiriusTextDsl.g:1798:2: ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalSiriusTextDsl.g:1798:2: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:1799:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:1799:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:1800:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getContainerCreationAccess().getContainerMappingsMappingCrossReference_19_0_0()); 
                    	    
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:1813:2: (otherlv_24= ',' ( ( ruleQualifiedName ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==22) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:1813:4: otherlv_24= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_24=(Token)match(input,22,FOLLOW_4); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getContainerCreationAccess().getCommaKeyword_19_1_0());
                    	        
                    	    // InternalSiriusTextDsl.g:1817:1: ( ( ruleQualifiedName ) )
                    	    // InternalSiriusTextDsl.g:1818:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalSiriusTextDsl.g:1818:1: ( ruleQualifiedName )
                    	    // InternalSiriusTextDsl.g:1819:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getContainerCreationAccess().getContainerMappingsMappingCrossReference_19_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_17);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_26=(Token)match(input,23,FOLLOW_55); 

                	newLeafNode(otherlv_26, grammarAccess.getContainerCreationAccess().getRightSquareBracketKeyword_20());
                
            // InternalSiriusTextDsl.g:1836:1: (otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==53) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalSiriusTextDsl.g:1836:3: otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']'
                    {
                    otherlv_27=(Token)match(input,53,FOLLOW_15); 

                        	newLeafNode(otherlv_27, grammarAccess.getContainerCreationAccess().getExtraMappingsKeyword_21_0());
                        
                    otherlv_28=(Token)match(input,20,FOLLOW_16); 

                        	newLeafNode(otherlv_28, grammarAccess.getContainerCreationAccess().getEqualsSignKeyword_21_1());
                        
                    otherlv_29=(Token)match(input,21,FOLLOW_20); 

                        	newLeafNode(otherlv_29, grammarAccess.getContainerCreationAccess().getLeftSquareBracketKeyword_21_2());
                        
                    // InternalSiriusTextDsl.g:1848:1: ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_ID) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1848:2: ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1848:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1849:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1849:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1850:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getContainerCreationRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getContainerCreationAccess().getExtraMappingsMappingCrossReference_21_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_17);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1863:2: (otherlv_31= ',' ( ( ruleQualifiedName ) ) )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==22) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1863:4: otherlv_31= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_31=(Token)match(input,22,FOLLOW_4); 

                            	        	newLeafNode(otherlv_31, grammarAccess.getContainerCreationAccess().getCommaKeyword_21_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1867:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1868:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1868:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1869:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getContainerCreationAccess().getExtraMappingsMappingCrossReference_21_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_17);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop56;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_33=(Token)match(input,23,FOLLOW_56); 

                        	newLeafNode(otherlv_33, grammarAccess.getContainerCreationAccess().getRightSquareBracketKeyword_21_4());
                        

                    }
                    break;

            }

            otherlv_34=(Token)match(input,54,FOLLOW_11); 

                	newLeafNode(otherlv_34, grammarAccess.getContainerCreationAccess().getBeginKeyword_22());
                
            otherlv_35=(Token)match(input,16,FOLLOW_57); 

                	newLeafNode(otherlv_35, grammarAccess.getContainerCreationAccess().getLeftCurlyBracketKeyword_23());
                
            // InternalSiriusTextDsl.g:1894:1: ( (lv_body_36_0= ruleOperation ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==33||LA59_0==55||(LA59_0>=57 && LA59_0<=58)||LA59_0==61||LA59_0==63||LA59_0==66||LA59_0==69||LA59_0==72||(LA59_0>=74 && LA59_0<=75)||LA59_0==77) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSiriusTextDsl.g:1895:1: (lv_body_36_0= ruleOperation )
                    {
                    // InternalSiriusTextDsl.g:1895:1: (lv_body_36_0= ruleOperation )
                    // InternalSiriusTextDsl.g:1896:3: lv_body_36_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerCreationAccess().getBodyOperationParserRuleCall_24_0()); 
                    	    
                    pushFollow(FOLLOW_21);
                    lv_body_36_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainerCreationRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_36_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_37=(Token)match(input,17,FOLLOW_21); 

                	newLeafNode(otherlv_37, grammarAccess.getContainerCreationAccess().getRightCurlyBracketKeyword_25());
                
            otherlv_38=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_38, grammarAccess.getContainerCreationAccess().getRightCurlyBracketKeyword_26());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerCreation"


    // $ANTLR start "entryRuleOperation"
    // InternalSiriusTextDsl.g:1928:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalSiriusTextDsl.g:1929:2: (iv_ruleOperation= ruleOperation EOF )
            // InternalSiriusTextDsl.g:1930:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalSiriusTextDsl.g:1937:1: ruleOperation returns [EObject current=null] : (this_ChangeContext_0= ruleChangeContext | this_For_1= ruleFor | this_If_2= ruleIf | this_Set_3= ruleSet | this_CreateInstance_4= ruleCreateInstance | this_CreateView_5= ruleCreateView | this_Unset_6= ruleUnset | this_CreateEdgeView_7= ruleCreateEdgeView | this_DeleteView_8= ruleDeleteView | this_Remove_9= ruleRemove | this_Move_10= ruleMove | this_Switch_11= ruleSwitch ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_ChangeContext_0 = null;

        EObject this_For_1 = null;

        EObject this_If_2 = null;

        EObject this_Set_3 = null;

        EObject this_CreateInstance_4 = null;

        EObject this_CreateView_5 = null;

        EObject this_Unset_6 = null;

        EObject this_CreateEdgeView_7 = null;

        EObject this_DeleteView_8 = null;

        EObject this_Remove_9 = null;

        EObject this_Move_10 = null;

        EObject this_Switch_11 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1940:28: ( (this_ChangeContext_0= ruleChangeContext | this_For_1= ruleFor | this_If_2= ruleIf | this_Set_3= ruleSet | this_CreateInstance_4= ruleCreateInstance | this_CreateView_5= ruleCreateView | this_Unset_6= ruleUnset | this_CreateEdgeView_7= ruleCreateEdgeView | this_DeleteView_8= ruleDeleteView | this_Remove_9= ruleRemove | this_Move_10= ruleMove | this_Switch_11= ruleSwitch ) )
            // InternalSiriusTextDsl.g:1941:1: (this_ChangeContext_0= ruleChangeContext | this_For_1= ruleFor | this_If_2= ruleIf | this_Set_3= ruleSet | this_CreateInstance_4= ruleCreateInstance | this_CreateView_5= ruleCreateView | this_Unset_6= ruleUnset | this_CreateEdgeView_7= ruleCreateEdgeView | this_DeleteView_8= ruleDeleteView | this_Remove_9= ruleRemove | this_Move_10= ruleMove | this_Switch_11= ruleSwitch )
            {
            // InternalSiriusTextDsl.g:1941:1: (this_ChangeContext_0= ruleChangeContext | this_For_1= ruleFor | this_If_2= ruleIf | this_Set_3= ruleSet | this_CreateInstance_4= ruleCreateInstance | this_CreateView_5= ruleCreateView | this_Unset_6= ruleUnset | this_CreateEdgeView_7= ruleCreateEdgeView | this_DeleteView_8= ruleDeleteView | this_Remove_9= ruleRemove | this_Move_10= ruleMove | this_Switch_11= ruleSwitch )
            int alt60=12;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt60=1;
                }
                break;
            case 33:
                {
                alt60=2;
                }
                break;
            case 57:
                {
                alt60=3;
                }
                break;
            case 58:
                {
                alt60=4;
                }
                break;
            case 63:
                {
                alt60=5;
                }
                break;
            case 66:
                {
                alt60=6;
                }
                break;
            case 61:
                {
                alt60=7;
                }
                break;
            case 69:
                {
                alt60=8;
                }
                break;
            case 72:
                {
                alt60=9;
                }
                break;
            case 74:
                {
                alt60=10;
                }
                break;
            case 75:
                {
                alt60=11;
                }
                break;
            case 77:
                {
                alt60=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalSiriusTextDsl.g:1942:5: this_ChangeContext_0= ruleChangeContext
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getChangeContextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ChangeContext_0=ruleChangeContext();

                    state._fsp--;

                     
                            current = this_ChangeContext_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:1952:5: this_For_1= ruleFor
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getForParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_For_1=ruleFor();

                    state._fsp--;

                     
                            current = this_For_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:1962:5: this_If_2= ruleIf
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getIfParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_If_2=ruleIf();

                    state._fsp--;

                     
                            current = this_If_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:1972:5: this_Set_3= ruleSet
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getSetParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Set_3=ruleSet();

                    state._fsp--;

                     
                            current = this_Set_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalSiriusTextDsl.g:1982:5: this_CreateInstance_4= ruleCreateInstance
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getCreateInstanceParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_CreateInstance_4=ruleCreateInstance();

                    state._fsp--;

                     
                            current = this_CreateInstance_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalSiriusTextDsl.g:1992:5: this_CreateView_5= ruleCreateView
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getCreateViewParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_CreateView_5=ruleCreateView();

                    state._fsp--;

                     
                            current = this_CreateView_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalSiriusTextDsl.g:2002:5: this_Unset_6= ruleUnset
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getUnsetParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Unset_6=ruleUnset();

                    state._fsp--;

                     
                            current = this_Unset_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalSiriusTextDsl.g:2012:5: this_CreateEdgeView_7= ruleCreateEdgeView
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getCreateEdgeViewParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_CreateEdgeView_7=ruleCreateEdgeView();

                    state._fsp--;

                     
                            current = this_CreateEdgeView_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalSiriusTextDsl.g:2022:5: this_DeleteView_8= ruleDeleteView
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getDeleteViewParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DeleteView_8=ruleDeleteView();

                    state._fsp--;

                     
                            current = this_DeleteView_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // InternalSiriusTextDsl.g:2032:5: this_Remove_9= ruleRemove
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getRemoveParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Remove_9=ruleRemove();

                    state._fsp--;

                     
                            current = this_Remove_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // InternalSiriusTextDsl.g:2042:5: this_Move_10= ruleMove
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getMoveParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Move_10=ruleMove();

                    state._fsp--;

                     
                            current = this_Move_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // InternalSiriusTextDsl.g:2052:5: this_Switch_11= ruleSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getSwitchParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Switch_11=ruleSwitch();

                    state._fsp--;

                     
                            current = this_Switch_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleChangeContext"
    // InternalSiriusTextDsl.g:2068:1: entryRuleChangeContext returns [EObject current=null] : iv_ruleChangeContext= ruleChangeContext EOF ;
    public final EObject entryRuleChangeContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeContext = null;


        try {
            // InternalSiriusTextDsl.g:2069:2: (iv_ruleChangeContext= ruleChangeContext EOF )
            // InternalSiriusTextDsl.g:2070:2: iv_ruleChangeContext= ruleChangeContext EOF
            {
             newCompositeNode(grammarAccess.getChangeContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeContext=ruleChangeContext();

            state._fsp--;

             current =iv_ruleChangeContext; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChangeContext"


    // $ANTLR start "ruleChangeContext"
    // InternalSiriusTextDsl.g:2077:1: ruleChangeContext returns [EObject current=null] : (otherlv_0= 'changeContext' otherlv_1= '(' ( (lv_browseExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleChangeContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_browseExpression_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2080:28: ( (otherlv_0= 'changeContext' otherlv_1= '(' ( (lv_browseExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )? ) )
            // InternalSiriusTextDsl.g:2081:1: (otherlv_0= 'changeContext' otherlv_1= '(' ( (lv_browseExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )? )
            {
            // InternalSiriusTextDsl.g:2081:1: (otherlv_0= 'changeContext' otherlv_1= '(' ( (lv_browseExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )? )
            // InternalSiriusTextDsl.g:2081:3: otherlv_0= 'changeContext' otherlv_1= '(' ( (lv_browseExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,55,FOLLOW_48); 

                	newLeafNode(otherlv_0, grammarAccess.getChangeContextAccess().getChangeContextKeyword_0());
                
            otherlv_1=(Token)match(input,48,FOLLOW_32); 

                	newLeafNode(otherlv_1, grammarAccess.getChangeContextAccess().getLeftParenthesisKeyword_1());
                
            // InternalSiriusTextDsl.g:2089:1: ( (lv_browseExpression_2_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2090:1: (lv_browseExpression_2_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2090:1: (lv_browseExpression_2_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2091:3: lv_browseExpression_2_0= RULE_EXPRESSION
            {
            lv_browseExpression_2_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_49); 

            			newLeafNode(lv_browseExpression_2_0, grammarAccess.getChangeContextAccess().getBrowseExpressionEXPRESSIONTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChangeContextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"browseExpression",
                    		lv_browseExpression_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_58); 

                	newLeafNode(otherlv_3, grammarAccess.getChangeContextAccess().getRightParenthesisKeyword_3());
                
            // InternalSiriusTextDsl.g:2111:1: (otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==16) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSiriusTextDsl.g:2111:3: otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_57); 

                        	newLeafNode(otherlv_4, grammarAccess.getChangeContextAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // InternalSiriusTextDsl.g:2115:1: ( (lv_body_5_0= ruleOperation ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==33||LA61_0==55||(LA61_0>=57 && LA61_0<=58)||LA61_0==61||LA61_0==63||LA61_0==66||LA61_0==69||LA61_0==72||(LA61_0>=74 && LA61_0<=75)||LA61_0==77) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:2116:1: (lv_body_5_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:2116:1: (lv_body_5_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:2117:3: lv_body_5_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getChangeContextAccess().getBodyOperationParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_57);
                    	    lv_body_5_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getChangeContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_5_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_2); 

                        	newLeafNode(otherlv_6, grammarAccess.getChangeContextAccess().getRightCurlyBracketKeyword_4_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChangeContext"


    // $ANTLR start "entryRuleFor"
    // InternalSiriusTextDsl.g:2145:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalSiriusTextDsl.g:2146:2: (iv_ruleFor= ruleFor EOF )
            // InternalSiriusTextDsl.g:2147:2: iv_ruleFor= ruleFor EOF
            {
             newCompositeNode(grammarAccess.getForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;

             current =iv_ruleFor; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalSiriusTextDsl.g:2154:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_iteratorName_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_expression_4_0= RULE_EXPRESSION ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleOperation ) )* otherlv_8= '}' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_iteratorName_2_0=null;
        Token otherlv_3=null;
        Token lv_expression_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_body_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2157:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_iteratorName_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_expression_4_0= RULE_EXPRESSION ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleOperation ) )* otherlv_8= '}' ) )
            // InternalSiriusTextDsl.g:2158:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_iteratorName_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_expression_4_0= RULE_EXPRESSION ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleOperation ) )* otherlv_8= '}' )
            {
            // InternalSiriusTextDsl.g:2158:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_iteratorName_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_expression_4_0= RULE_EXPRESSION ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleOperation ) )* otherlv_8= '}' )
            // InternalSiriusTextDsl.g:2158:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_iteratorName_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_expression_4_0= RULE_EXPRESSION ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleOperation ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_48); 

                	newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
                
            otherlv_1=(Token)match(input,48,FOLLOW_10); 

                	newLeafNode(otherlv_1, grammarAccess.getForAccess().getLeftParenthesisKeyword_1());
                
            // InternalSiriusTextDsl.g:2166:1: ( (lv_iteratorName_2_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2167:1: (lv_iteratorName_2_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2167:1: (lv_iteratorName_2_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2168:3: lv_iteratorName_2_0= RULE_STRING
            {
            lv_iteratorName_2_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

            			newLeafNode(lv_iteratorName_2_0, grammarAccess.getForAccess().getIteratorNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"iteratorName",
                    		lv_iteratorName_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,56,FOLLOW_32); 

                	newLeafNode(otherlv_3, grammarAccess.getForAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:2188:1: ( (lv_expression_4_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2189:1: (lv_expression_4_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2189:1: (lv_expression_4_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2190:3: lv_expression_4_0= RULE_EXPRESSION
            {
            lv_expression_4_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_49); 

            			newLeafNode(lv_expression_4_0, grammarAccess.getForAccess().getExpressionEXPRESSIONTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"expression",
                    		lv_expression_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_5=(Token)match(input,49,FOLLOW_11); 

                	newLeafNode(otherlv_5, grammarAccess.getForAccess().getRightParenthesisKeyword_5());
                
            otherlv_6=(Token)match(input,16,FOLLOW_57); 

                	newLeafNode(otherlv_6, grammarAccess.getForAccess().getLeftCurlyBracketKeyword_6());
                
            // InternalSiriusTextDsl.g:2214:1: ( (lv_body_7_0= ruleOperation ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==33||LA63_0==55||(LA63_0>=57 && LA63_0<=58)||LA63_0==61||LA63_0==63||LA63_0==66||LA63_0==69||LA63_0==72||(LA63_0>=74 && LA63_0<=75)||LA63_0==77) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2215:1: (lv_body_7_0= ruleOperation )
            	    {
            	    // InternalSiriusTextDsl.g:2215:1: (lv_body_7_0= ruleOperation )
            	    // InternalSiriusTextDsl.g:2216:3: lv_body_7_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getForAccess().getBodyOperationParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_57);
            	    lv_body_7_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getForRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_7_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getForAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleIf"
    // InternalSiriusTextDsl.g:2244:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalSiriusTextDsl.g:2245:2: (iv_ruleIf= ruleIf EOF )
            // InternalSiriusTextDsl.g:2246:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalSiriusTextDsl.g:2253:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_conditionExpression_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2256:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' ) )
            // InternalSiriusTextDsl.g:2257:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )
            {
            // InternalSiriusTextDsl.g:2257:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )
            // InternalSiriusTextDsl.g:2257:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_48); 

                	newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,48,FOLLOW_32); 

                	newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
                
            // InternalSiriusTextDsl.g:2265:1: ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2266:1: (lv_conditionExpression_2_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2266:1: (lv_conditionExpression_2_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2267:3: lv_conditionExpression_2_0= RULE_EXPRESSION
            {
            lv_conditionExpression_2_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_49); 

            			newLeafNode(lv_conditionExpression_2_0, grammarAccess.getIfAccess().getConditionExpressionEXPRESSIONTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIfRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"conditionExpression",
                    		lv_conditionExpression_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_11); 

                	newLeafNode(otherlv_3, grammarAccess.getIfAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_57); 

                	newLeafNode(otherlv_4, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSiriusTextDsl.g:2291:1: ( (lv_body_5_0= ruleOperation ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==33||LA64_0==55||(LA64_0>=57 && LA64_0<=58)||LA64_0==61||LA64_0==63||LA64_0==66||LA64_0==69||LA64_0==72||(LA64_0>=74 && LA64_0<=75)||LA64_0==77) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2292:1: (lv_body_5_0= ruleOperation )
            	    {
            	    // InternalSiriusTextDsl.g:2292:1: (lv_body_5_0= ruleOperation )
            	    // InternalSiriusTextDsl.g:2293:3: lv_body_5_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfAccess().getBodyOperationParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_57);
            	    lv_body_5_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_5_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleSet"
    // InternalSiriusTextDsl.g:2321:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // InternalSiriusTextDsl.g:2322:2: (iv_ruleSet= ruleSet EOF )
            // InternalSiriusTextDsl.g:2323:2: iv_ruleSet= ruleSet EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSet=ruleSet();

            state._fsp--;

             current =iv_ruleSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalSiriusTextDsl.g:2330:1: ruleSet returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'valueExpression' otherlv_7= ':' ( (lv_valueExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_featureName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_valueExpression_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_body_11_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2333:28: ( (otherlv_0= 'set' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'valueExpression' otherlv_7= ':' ( (lv_valueExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? ) )
            // InternalSiriusTextDsl.g:2334:1: (otherlv_0= 'set' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'valueExpression' otherlv_7= ':' ( (lv_valueExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? )
            {
            // InternalSiriusTextDsl.g:2334:1: (otherlv_0= 'set' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'valueExpression' otherlv_7= ':' ( (lv_valueExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? )
            // InternalSiriusTextDsl.g:2334:3: otherlv_0= 'set' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'valueExpression' otherlv_7= ':' ( (lv_valueExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,58,FOLLOW_48); 

                	newLeafNode(otherlv_0, grammarAccess.getSetAccess().getSetKeyword_0());
                
            otherlv_1=(Token)match(input,48,FOLLOW_60); 

                	newLeafNode(otherlv_1, grammarAccess.getSetAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,59,FOLLOW_59); 

                	newLeafNode(otherlv_2, grammarAccess.getSetAccess().getFeatureNameKeyword_2());
                
            otherlv_3=(Token)match(input,56,FOLLOW_10); 

                	newLeafNode(otherlv_3, grammarAccess.getSetAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:2350:1: ( (lv_featureName_4_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2351:1: (lv_featureName_4_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2351:1: (lv_featureName_4_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2352:3: lv_featureName_4_0= RULE_STRING
            {
            lv_featureName_4_0=(Token)match(input,RULE_STRING,FOLLOW_61); 

            			newLeafNode(lv_featureName_4_0, grammarAccess.getSetAccess().getFeatureNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"featureName",
                    		lv_featureName_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_62); 

                	newLeafNode(otherlv_5, grammarAccess.getSetAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,60,FOLLOW_59); 

                	newLeafNode(otherlv_6, grammarAccess.getSetAccess().getValueExpressionKeyword_6());
                
            otherlv_7=(Token)match(input,56,FOLLOW_32); 

                	newLeafNode(otherlv_7, grammarAccess.getSetAccess().getColonKeyword_7());
                
            // InternalSiriusTextDsl.g:2380:1: ( (lv_valueExpression_8_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2381:1: (lv_valueExpression_8_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2381:1: (lv_valueExpression_8_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2382:3: lv_valueExpression_8_0= RULE_EXPRESSION
            {
            lv_valueExpression_8_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_49); 

            			newLeafNode(lv_valueExpression_8_0, grammarAccess.getSetAccess().getValueExpressionEXPRESSIONTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"valueExpression",
                    		lv_valueExpression_8_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_9=(Token)match(input,49,FOLLOW_58); 

                	newLeafNode(otherlv_9, grammarAccess.getSetAccess().getRightParenthesisKeyword_9());
                
            // InternalSiriusTextDsl.g:2402:1: (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==16) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalSiriusTextDsl.g:2402:3: otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_57); 

                        	newLeafNode(otherlv_10, grammarAccess.getSetAccess().getLeftCurlyBracketKeyword_10_0());
                        
                    // InternalSiriusTextDsl.g:2406:1: ( (lv_body_11_0= ruleOperation ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==33||LA65_0==55||(LA65_0>=57 && LA65_0<=58)||LA65_0==61||LA65_0==63||LA65_0==66||LA65_0==69||LA65_0==72||(LA65_0>=74 && LA65_0<=75)||LA65_0==77) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:2407:1: (lv_body_11_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:2407:1: (lv_body_11_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:2408:3: lv_body_11_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSetAccess().getBodyOperationParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_57);
                    	    lv_body_11_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSetRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_11_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_2); 

                        	newLeafNode(otherlv_12, grammarAccess.getSetAccess().getRightCurlyBracketKeyword_10_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleUnset"
    // InternalSiriusTextDsl.g:2436:1: entryRuleUnset returns [EObject current=null] : iv_ruleUnset= ruleUnset EOF ;
    public final EObject entryRuleUnset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnset = null;


        try {
            // InternalSiriusTextDsl.g:2437:2: (iv_ruleUnset= ruleUnset EOF )
            // InternalSiriusTextDsl.g:2438:2: iv_ruleUnset= ruleUnset EOF
            {
             newCompositeNode(grammarAccess.getUnsetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnset=ruleUnset();

            state._fsp--;

             current =iv_ruleUnset; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnset"


    // $ANTLR start "ruleUnset"
    // InternalSiriusTextDsl.g:2445:1: ruleUnset returns [EObject current=null] : (otherlv_0= 'unset' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleUnset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_featureName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_elementExpression_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_body_11_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2448:28: ( (otherlv_0= 'unset' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? ) )
            // InternalSiriusTextDsl.g:2449:1: (otherlv_0= 'unset' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? )
            {
            // InternalSiriusTextDsl.g:2449:1: (otherlv_0= 'unset' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? )
            // InternalSiriusTextDsl.g:2449:3: otherlv_0= 'unset' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,61,FOLLOW_48); 

                	newLeafNode(otherlv_0, grammarAccess.getUnsetAccess().getUnsetKeyword_0());
                
            otherlv_1=(Token)match(input,48,FOLLOW_60); 

                	newLeafNode(otherlv_1, grammarAccess.getUnsetAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,59,FOLLOW_59); 

                	newLeafNode(otherlv_2, grammarAccess.getUnsetAccess().getFeatureNameKeyword_2());
                
            otherlv_3=(Token)match(input,56,FOLLOW_10); 

                	newLeafNode(otherlv_3, grammarAccess.getUnsetAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:2465:1: ( (lv_featureName_4_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2466:1: (lv_featureName_4_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2466:1: (lv_featureName_4_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2467:3: lv_featureName_4_0= RULE_STRING
            {
            lv_featureName_4_0=(Token)match(input,RULE_STRING,FOLLOW_63); 

            			newLeafNode(lv_featureName_4_0, grammarAccess.getUnsetAccess().getFeatureNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUnsetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"featureName",
                    		lv_featureName_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:2483:2: (otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==22) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalSiriusTextDsl.g:2483:4: otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_64); 

                        	newLeafNode(otherlv_5, grammarAccess.getUnsetAccess().getCommaKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,62,FOLLOW_59); 

                        	newLeafNode(otherlv_6, grammarAccess.getUnsetAccess().getElementExpressionKeyword_5_1());
                        
                    otherlv_7=(Token)match(input,56,FOLLOW_32); 

                        	newLeafNode(otherlv_7, grammarAccess.getUnsetAccess().getColonKeyword_5_2());
                        
                    // InternalSiriusTextDsl.g:2495:1: ( (lv_elementExpression_8_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:2496:1: (lv_elementExpression_8_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:2496:1: (lv_elementExpression_8_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:2497:3: lv_elementExpression_8_0= RULE_EXPRESSION
                    {
                    lv_elementExpression_8_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_49); 

                    			newLeafNode(lv_elementExpression_8_0, grammarAccess.getUnsetAccess().getElementExpressionEXPRESSIONTerminalRuleCall_5_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnsetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"elementExpression",
                            		lv_elementExpression_8_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,49,FOLLOW_58); 

                	newLeafNode(otherlv_9, grammarAccess.getUnsetAccess().getRightParenthesisKeyword_6());
                
            // InternalSiriusTextDsl.g:2517:1: (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==16) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalSiriusTextDsl.g:2517:3: otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_57); 

                        	newLeafNode(otherlv_10, grammarAccess.getUnsetAccess().getLeftCurlyBracketKeyword_7_0());
                        
                    // InternalSiriusTextDsl.g:2521:1: ( (lv_body_11_0= ruleOperation ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==33||LA68_0==55||(LA68_0>=57 && LA68_0<=58)||LA68_0==61||LA68_0==63||LA68_0==66||LA68_0==69||LA68_0==72||(LA68_0>=74 && LA68_0<=75)||LA68_0==77) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:2522:1: (lv_body_11_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:2522:1: (lv_body_11_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:2523:3: lv_body_11_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUnsetAccess().getBodyOperationParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_57);
                    	    lv_body_11_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUnsetRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_11_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_2); 

                        	newLeafNode(otherlv_12, grammarAccess.getUnsetAccess().getRightCurlyBracketKeyword_7_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnset"


    // $ANTLR start "entryRuleCreateInstance"
    // InternalSiriusTextDsl.g:2551:1: entryRuleCreateInstance returns [EObject current=null] : iv_ruleCreateInstance= ruleCreateInstance EOF ;
    public final EObject entryRuleCreateInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateInstance = null;


        try {
            // InternalSiriusTextDsl.g:2552:2: (iv_ruleCreateInstance= ruleCreateInstance EOF )
            // InternalSiriusTextDsl.g:2553:2: iv_ruleCreateInstance= ruleCreateInstance EOF
            {
             newCompositeNode(grammarAccess.getCreateInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateInstance=ruleCreateInstance();

            state._fsp--;

             current =iv_ruleCreateInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateInstance"


    // $ANTLR start "ruleCreateInstance"
    // InternalSiriusTextDsl.g:2560:1: ruleCreateInstance returns [EObject current=null] : (otherlv_0= 'createInstance' otherlv_1= '(' otherlv_2= 'referenceName' otherlv_3= ':' ( (lv_referenceName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? ) ;
    public final EObject ruleCreateInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_referenceName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_type_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_variableName_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_body_13_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2563:28: ( (otherlv_0= 'createInstance' otherlv_1= '(' otherlv_2= 'referenceName' otherlv_3= ':' ( (lv_referenceName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? ) )
            // InternalSiriusTextDsl.g:2564:1: (otherlv_0= 'createInstance' otherlv_1= '(' otherlv_2= 'referenceName' otherlv_3= ':' ( (lv_referenceName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? )
            {
            // InternalSiriusTextDsl.g:2564:1: (otherlv_0= 'createInstance' otherlv_1= '(' otherlv_2= 'referenceName' otherlv_3= ':' ( (lv_referenceName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? )
            // InternalSiriusTextDsl.g:2564:3: otherlv_0= 'createInstance' otherlv_1= '(' otherlv_2= 'referenceName' otherlv_3= ':' ( (lv_referenceName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )?
            {
            otherlv_0=(Token)match(input,63,FOLLOW_48); 

                	newLeafNode(otherlv_0, grammarAccess.getCreateInstanceAccess().getCreateInstanceKeyword_0());
                
            otherlv_1=(Token)match(input,48,FOLLOW_65); 

                	newLeafNode(otherlv_1, grammarAccess.getCreateInstanceAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,64,FOLLOW_59); 

                	newLeafNode(otherlv_2, grammarAccess.getCreateInstanceAccess().getReferenceNameKeyword_2());
                
            otherlv_3=(Token)match(input,56,FOLLOW_10); 

                	newLeafNode(otherlv_3, grammarAccess.getCreateInstanceAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:2580:1: ( (lv_referenceName_4_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2581:1: (lv_referenceName_4_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2581:1: (lv_referenceName_4_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2582:3: lv_referenceName_4_0= RULE_STRING
            {
            lv_referenceName_4_0=(Token)match(input,RULE_STRING,FOLLOW_61); 

            			newLeafNode(lv_referenceName_4_0, grammarAccess.getCreateInstanceAccess().getReferenceNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"referenceName",
                    		lv_referenceName_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_66); 

                	newLeafNode(otherlv_5, grammarAccess.getCreateInstanceAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,65,FOLLOW_59); 

                	newLeafNode(otherlv_6, grammarAccess.getCreateInstanceAccess().getTypeKeyword_6());
                
            otherlv_7=(Token)match(input,56,FOLLOW_10); 

                	newLeafNode(otherlv_7, grammarAccess.getCreateInstanceAccess().getColonKeyword_7());
                
            // InternalSiriusTextDsl.g:2610:1: ( (lv_type_8_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2611:1: (lv_type_8_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2611:1: (lv_type_8_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2612:3: lv_type_8_0= RULE_STRING
            {
            lv_type_8_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

            			newLeafNode(lv_type_8_0, grammarAccess.getCreateInstanceAccess().getTypeSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_8_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,49,FOLLOW_67); 

                	newLeafNode(otherlv_9, grammarAccess.getCreateInstanceAccess().getRightParenthesisKeyword_9());
                
            otherlv_10=(Token)match(input,15,FOLLOW_10); 

                	newLeafNode(otherlv_10, grammarAccess.getCreateInstanceAccess().getAsKeyword_10());
                
            // InternalSiriusTextDsl.g:2636:1: ( (lv_variableName_11_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2637:1: (lv_variableName_11_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2637:1: (lv_variableName_11_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2638:3: lv_variableName_11_0= RULE_STRING
            {
            lv_variableName_11_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

            			newLeafNode(lv_variableName_11_0, grammarAccess.getCreateInstanceAccess().getVariableNameSTRINGTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variableName",
                    		lv_variableName_11_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:2654:2: (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==16) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalSiriusTextDsl.g:2654:4: otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}'
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_57); 

                        	newLeafNode(otherlv_12, grammarAccess.getCreateInstanceAccess().getLeftCurlyBracketKeyword_12_0());
                        
                    // InternalSiriusTextDsl.g:2658:1: ( (lv_body_13_0= ruleOperation ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==33||LA70_0==55||(LA70_0>=57 && LA70_0<=58)||LA70_0==61||LA70_0==63||LA70_0==66||LA70_0==69||LA70_0==72||(LA70_0>=74 && LA70_0<=75)||LA70_0==77) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:2659:1: (lv_body_13_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:2659:1: (lv_body_13_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:2660:3: lv_body_13_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCreateInstanceAccess().getBodyOperationParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_57);
                    	    lv_body_13_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCreateInstanceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_13_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FOLLOW_2); 

                        	newLeafNode(otherlv_14, grammarAccess.getCreateInstanceAccess().getRightCurlyBracketKeyword_12_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateInstance"


    // $ANTLR start "entryRuleCreateView"
    // InternalSiriusTextDsl.g:2688:1: entryRuleCreateView returns [EObject current=null] : iv_ruleCreateView= ruleCreateView EOF ;
    public final EObject entryRuleCreateView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateView = null;


        try {
            // InternalSiriusTextDsl.g:2689:2: (iv_ruleCreateView= ruleCreateView EOF )
            // InternalSiriusTextDsl.g:2690:2: iv_ruleCreateView= ruleCreateView EOF
            {
             newCompositeNode(grammarAccess.getCreateViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateView=ruleCreateView();

            state._fsp--;

             current =iv_ruleCreateView; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateView"


    // $ANTLR start "ruleCreateView"
    // InternalSiriusTextDsl.g:2697:1: ruleCreateView returns [EObject current=null] : (otherlv_0= 'createView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'containerViewExpression' otherlv_7= ':' ( (lv_containerViewExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? ) ;
    public final EObject ruleCreateView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_containerViewExpression_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_variableName_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_body_13_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2700:28: ( (otherlv_0= 'createView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'containerViewExpression' otherlv_7= ':' ( (lv_containerViewExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? ) )
            // InternalSiriusTextDsl.g:2701:1: (otherlv_0= 'createView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'containerViewExpression' otherlv_7= ':' ( (lv_containerViewExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? )
            {
            // InternalSiriusTextDsl.g:2701:1: (otherlv_0= 'createView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'containerViewExpression' otherlv_7= ':' ( (lv_containerViewExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? )
            // InternalSiriusTextDsl.g:2701:3: otherlv_0= 'createView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'containerViewExpression' otherlv_7= ':' ( (lv_containerViewExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )?
            {
            otherlv_0=(Token)match(input,66,FOLLOW_48); 

                	newLeafNode(otherlv_0, grammarAccess.getCreateViewAccess().getCreateViewKeyword_0());
                
            otherlv_1=(Token)match(input,48,FOLLOW_68); 

                	newLeafNode(otherlv_1, grammarAccess.getCreateViewAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,67,FOLLOW_59); 

                	newLeafNode(otherlv_2, grammarAccess.getCreateViewAccess().getMappingKeyword_2());
                
            otherlv_3=(Token)match(input,56,FOLLOW_4); 

                	newLeafNode(otherlv_3, grammarAccess.getCreateViewAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:2717:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:2718:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:2718:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:2719:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateViewRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCreateViewAccess().getMappingMappingCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_61);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_69); 

                	newLeafNode(otherlv_5, grammarAccess.getCreateViewAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,68,FOLLOW_59); 

                	newLeafNode(otherlv_6, grammarAccess.getCreateViewAccess().getContainerViewExpressionKeyword_6());
                
            otherlv_7=(Token)match(input,56,FOLLOW_32); 

                	newLeafNode(otherlv_7, grammarAccess.getCreateViewAccess().getColonKeyword_7());
                
            // InternalSiriusTextDsl.g:2744:1: ( (lv_containerViewExpression_8_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2745:1: (lv_containerViewExpression_8_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2745:1: (lv_containerViewExpression_8_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2746:3: lv_containerViewExpression_8_0= RULE_EXPRESSION
            {
            lv_containerViewExpression_8_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_49); 

            			newLeafNode(lv_containerViewExpression_8_0, grammarAccess.getCreateViewAccess().getContainerViewExpressionEXPRESSIONTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"containerViewExpression",
                    		lv_containerViewExpression_8_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_9=(Token)match(input,49,FOLLOW_67); 

                	newLeafNode(otherlv_9, grammarAccess.getCreateViewAccess().getRightParenthesisKeyword_9());
                
            otherlv_10=(Token)match(input,15,FOLLOW_10); 

                	newLeafNode(otherlv_10, grammarAccess.getCreateViewAccess().getAsKeyword_10());
                
            // InternalSiriusTextDsl.g:2770:1: ( (lv_variableName_11_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2771:1: (lv_variableName_11_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2771:1: (lv_variableName_11_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2772:3: lv_variableName_11_0= RULE_STRING
            {
            lv_variableName_11_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

            			newLeafNode(lv_variableName_11_0, grammarAccess.getCreateViewAccess().getVariableNameSTRINGTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variableName",
                    		lv_variableName_11_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:2788:2: (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==16) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalSiriusTextDsl.g:2788:4: otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}'
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_57); 

                        	newLeafNode(otherlv_12, grammarAccess.getCreateViewAccess().getLeftCurlyBracketKeyword_12_0());
                        
                    // InternalSiriusTextDsl.g:2792:1: ( (lv_body_13_0= ruleOperation ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==33||LA72_0==55||(LA72_0>=57 && LA72_0<=58)||LA72_0==61||LA72_0==63||LA72_0==66||LA72_0==69||LA72_0==72||(LA72_0>=74 && LA72_0<=75)||LA72_0==77) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:2793:1: (lv_body_13_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:2793:1: (lv_body_13_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:2794:3: lv_body_13_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCreateViewAccess().getBodyOperationParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_57);
                    	    lv_body_13_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCreateViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_13_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FOLLOW_2); 

                        	newLeafNode(otherlv_14, grammarAccess.getCreateViewAccess().getRightCurlyBracketKeyword_12_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateView"


    // $ANTLR start "entryRuleCreateEdgeView"
    // InternalSiriusTextDsl.g:2822:1: entryRuleCreateEdgeView returns [EObject current=null] : iv_ruleCreateEdgeView= ruleCreateEdgeView EOF ;
    public final EObject entryRuleCreateEdgeView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateEdgeView = null;


        try {
            // InternalSiriusTextDsl.g:2823:2: (iv_ruleCreateEdgeView= ruleCreateEdgeView EOF )
            // InternalSiriusTextDsl.g:2824:2: iv_ruleCreateEdgeView= ruleCreateEdgeView EOF
            {
             newCompositeNode(grammarAccess.getCreateEdgeViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateEdgeView=ruleCreateEdgeView();

            state._fsp--;

             current =iv_ruleCreateEdgeView; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateEdgeView"


    // $ANTLR start "ruleCreateEdgeView"
    // InternalSiriusTextDsl.g:2831:1: ruleCreateEdgeView returns [EObject current=null] : (otherlv_0= 'createEdgeView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'sourceExpression' otherlv_7= ':' ( (lv_sourceExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ',' otherlv_10= 'targetExpression' otherlv_11= ':' ( (lv_targetExpression_12_0= RULE_EXPRESSION ) ) otherlv_13= ',' otherlv_14= 'containerViewExpression' otherlv_15= ':' ( (lv_containerViewExpression_16_0= RULE_EXPRESSION ) ) otherlv_17= ')' otherlv_18= 'as' ( (lv_variableName_19_0= RULE_STRING ) ) (otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}' )? ) ;
    public final EObject ruleCreateEdgeView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_sourceExpression_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_targetExpression_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_containerViewExpression_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_variableName_19_0=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_body_21_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2834:28: ( (otherlv_0= 'createEdgeView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'sourceExpression' otherlv_7= ':' ( (lv_sourceExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ',' otherlv_10= 'targetExpression' otherlv_11= ':' ( (lv_targetExpression_12_0= RULE_EXPRESSION ) ) otherlv_13= ',' otherlv_14= 'containerViewExpression' otherlv_15= ':' ( (lv_containerViewExpression_16_0= RULE_EXPRESSION ) ) otherlv_17= ')' otherlv_18= 'as' ( (lv_variableName_19_0= RULE_STRING ) ) (otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}' )? ) )
            // InternalSiriusTextDsl.g:2835:1: (otherlv_0= 'createEdgeView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'sourceExpression' otherlv_7= ':' ( (lv_sourceExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ',' otherlv_10= 'targetExpression' otherlv_11= ':' ( (lv_targetExpression_12_0= RULE_EXPRESSION ) ) otherlv_13= ',' otherlv_14= 'containerViewExpression' otherlv_15= ':' ( (lv_containerViewExpression_16_0= RULE_EXPRESSION ) ) otherlv_17= ')' otherlv_18= 'as' ( (lv_variableName_19_0= RULE_STRING ) ) (otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}' )? )
            {
            // InternalSiriusTextDsl.g:2835:1: (otherlv_0= 'createEdgeView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'sourceExpression' otherlv_7= ':' ( (lv_sourceExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ',' otherlv_10= 'targetExpression' otherlv_11= ':' ( (lv_targetExpression_12_0= RULE_EXPRESSION ) ) otherlv_13= ',' otherlv_14= 'containerViewExpression' otherlv_15= ':' ( (lv_containerViewExpression_16_0= RULE_EXPRESSION ) ) otherlv_17= ')' otherlv_18= 'as' ( (lv_variableName_19_0= RULE_STRING ) ) (otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}' )? )
            // InternalSiriusTextDsl.g:2835:3: otherlv_0= 'createEdgeView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'sourceExpression' otherlv_7= ':' ( (lv_sourceExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ',' otherlv_10= 'targetExpression' otherlv_11= ':' ( (lv_targetExpression_12_0= RULE_EXPRESSION ) ) otherlv_13= ',' otherlv_14= 'containerViewExpression' otherlv_15= ':' ( (lv_containerViewExpression_16_0= RULE_EXPRESSION ) ) otherlv_17= ')' otherlv_18= 'as' ( (lv_variableName_19_0= RULE_STRING ) ) (otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}' )?
            {
            otherlv_0=(Token)match(input,69,FOLLOW_48); 

                	newLeafNode(otherlv_0, grammarAccess.getCreateEdgeViewAccess().getCreateEdgeViewKeyword_0());
                
            otherlv_1=(Token)match(input,48,FOLLOW_68); 

                	newLeafNode(otherlv_1, grammarAccess.getCreateEdgeViewAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,67,FOLLOW_59); 

                	newLeafNode(otherlv_2, grammarAccess.getCreateEdgeViewAccess().getMappingKeyword_2());
                
            otherlv_3=(Token)match(input,56,FOLLOW_4); 

                	newLeafNode(otherlv_3, grammarAccess.getCreateEdgeViewAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:2851:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:2852:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:2852:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:2853:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateEdgeViewRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCreateEdgeViewAccess().getEdgeEdgeCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_61);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_70); 

                	newLeafNode(otherlv_5, grammarAccess.getCreateEdgeViewAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,70,FOLLOW_59); 

                	newLeafNode(otherlv_6, grammarAccess.getCreateEdgeViewAccess().getSourceExpressionKeyword_6());
                
            otherlv_7=(Token)match(input,56,FOLLOW_32); 

                	newLeafNode(otherlv_7, grammarAccess.getCreateEdgeViewAccess().getColonKeyword_7());
                
            // InternalSiriusTextDsl.g:2878:1: ( (lv_sourceExpression_8_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2879:1: (lv_sourceExpression_8_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2879:1: (lv_sourceExpression_8_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2880:3: lv_sourceExpression_8_0= RULE_EXPRESSION
            {
            lv_sourceExpression_8_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_61); 

            			newLeafNode(lv_sourceExpression_8_0, grammarAccess.getCreateEdgeViewAccess().getSourceExpressionEXPRESSIONTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateEdgeViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sourceExpression",
                    		lv_sourceExpression_8_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_71); 

                	newLeafNode(otherlv_9, grammarAccess.getCreateEdgeViewAccess().getCommaKeyword_9());
                
            otherlv_10=(Token)match(input,71,FOLLOW_59); 

                	newLeafNode(otherlv_10, grammarAccess.getCreateEdgeViewAccess().getTargetExpressionKeyword_10());
                
            otherlv_11=(Token)match(input,56,FOLLOW_32); 

                	newLeafNode(otherlv_11, grammarAccess.getCreateEdgeViewAccess().getColonKeyword_11());
                
            // InternalSiriusTextDsl.g:2908:1: ( (lv_targetExpression_12_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2909:1: (lv_targetExpression_12_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2909:1: (lv_targetExpression_12_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2910:3: lv_targetExpression_12_0= RULE_EXPRESSION
            {
            lv_targetExpression_12_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_61); 

            			newLeafNode(lv_targetExpression_12_0, grammarAccess.getCreateEdgeViewAccess().getTargetExpressionEXPRESSIONTerminalRuleCall_12_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateEdgeViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"targetExpression",
                    		lv_targetExpression_12_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_13=(Token)match(input,22,FOLLOW_69); 

                	newLeafNode(otherlv_13, grammarAccess.getCreateEdgeViewAccess().getCommaKeyword_13());
                
            otherlv_14=(Token)match(input,68,FOLLOW_59); 

                	newLeafNode(otherlv_14, grammarAccess.getCreateEdgeViewAccess().getContainerViewExpressionKeyword_14());
                
            otherlv_15=(Token)match(input,56,FOLLOW_32); 

                	newLeafNode(otherlv_15, grammarAccess.getCreateEdgeViewAccess().getColonKeyword_15());
                
            // InternalSiriusTextDsl.g:2938:1: ( (lv_containerViewExpression_16_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2939:1: (lv_containerViewExpression_16_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2939:1: (lv_containerViewExpression_16_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2940:3: lv_containerViewExpression_16_0= RULE_EXPRESSION
            {
            lv_containerViewExpression_16_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_49); 

            			newLeafNode(lv_containerViewExpression_16_0, grammarAccess.getCreateEdgeViewAccess().getContainerViewExpressionEXPRESSIONTerminalRuleCall_16_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateEdgeViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"containerViewExpression",
                    		lv_containerViewExpression_16_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_17=(Token)match(input,49,FOLLOW_67); 

                	newLeafNode(otherlv_17, grammarAccess.getCreateEdgeViewAccess().getRightParenthesisKeyword_17());
                
            otherlv_18=(Token)match(input,15,FOLLOW_10); 

                	newLeafNode(otherlv_18, grammarAccess.getCreateEdgeViewAccess().getAsKeyword_18());
                
            // InternalSiriusTextDsl.g:2964:1: ( (lv_variableName_19_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2965:1: (lv_variableName_19_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2965:1: (lv_variableName_19_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2966:3: lv_variableName_19_0= RULE_STRING
            {
            lv_variableName_19_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

            			newLeafNode(lv_variableName_19_0, grammarAccess.getCreateEdgeViewAccess().getVariableNameSTRINGTerminalRuleCall_19_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateEdgeViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variableName",
                    		lv_variableName_19_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:2982:2: (otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==16) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalSiriusTextDsl.g:2982:4: otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}'
                    {
                    otherlv_20=(Token)match(input,16,FOLLOW_57); 

                        	newLeafNode(otherlv_20, grammarAccess.getCreateEdgeViewAccess().getLeftCurlyBracketKeyword_20_0());
                        
                    // InternalSiriusTextDsl.g:2986:1: ( (lv_body_21_0= ruleOperation ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==33||LA74_0==55||(LA74_0>=57 && LA74_0<=58)||LA74_0==61||LA74_0==63||LA74_0==66||LA74_0==69||LA74_0==72||(LA74_0>=74 && LA74_0<=75)||LA74_0==77) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:2987:1: (lv_body_21_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:2987:1: (lv_body_21_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:2988:3: lv_body_21_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCreateEdgeViewAccess().getBodyOperationParserRuleCall_20_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_57);
                    	    lv_body_21_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCreateEdgeViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_21_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,17,FOLLOW_2); 

                        	newLeafNode(otherlv_22, grammarAccess.getCreateEdgeViewAccess().getRightCurlyBracketKeyword_20_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateEdgeView"


    // $ANTLR start "entryRuleDeleteView"
    // InternalSiriusTextDsl.g:3016:1: entryRuleDeleteView returns [EObject current=null] : iv_ruleDeleteView= ruleDeleteView EOF ;
    public final EObject entryRuleDeleteView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteView = null;


        try {
            // InternalSiriusTextDsl.g:3017:2: (iv_ruleDeleteView= ruleDeleteView EOF )
            // InternalSiriusTextDsl.g:3018:2: iv_ruleDeleteView= ruleDeleteView EOF
            {
             newCompositeNode(grammarAccess.getDeleteViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteView=ruleDeleteView();

            state._fsp--;

             current =iv_ruleDeleteView; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteView"


    // $ANTLR start "ruleDeleteView"
    // InternalSiriusTextDsl.g:3025:1: ruleDeleteView returns [EObject current=null] : ( () otherlv_1= 'deleteView' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleDeleteView() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3028:28: ( ( () otherlv_1= 'deleteView' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? ) )
            // InternalSiriusTextDsl.g:3029:1: ( () otherlv_1= 'deleteView' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? )
            {
            // InternalSiriusTextDsl.g:3029:1: ( () otherlv_1= 'deleteView' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? )
            // InternalSiriusTextDsl.g:3029:2: () otherlv_1= 'deleteView' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )?
            {
            // InternalSiriusTextDsl.g:3029:2: ()
            // InternalSiriusTextDsl.g:3030:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeleteViewAccess().getDeleteViewAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72); 

                	newLeafNode(otherlv_1, grammarAccess.getDeleteViewAccess().getDeleteViewKeyword_1());
                
            otherlv_2=(Token)match(input,73,FOLLOW_58); 

                	newLeafNode(otherlv_2, grammarAccess.getDeleteViewAccess().getLeftParenthesisRightParenthesisKeyword_2());
                
            // InternalSiriusTextDsl.g:3043:1: (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==16) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalSiriusTextDsl.g:3043:3: otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_57); 

                        	newLeafNode(otherlv_3, grammarAccess.getDeleteViewAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:3047:1: ( (lv_body_4_0= ruleOperation ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==33||LA76_0==55||(LA76_0>=57 && LA76_0<=58)||LA76_0==61||LA76_0==63||LA76_0==66||LA76_0==69||LA76_0==72||(LA76_0>=74 && LA76_0<=75)||LA76_0==77) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:3048:1: (lv_body_4_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:3048:1: (lv_body_4_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:3049:3: lv_body_4_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDeleteViewAccess().getBodyOperationParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_57);
                    	    lv_body_4_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDeleteViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_4_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_2); 

                        	newLeafNode(otherlv_5, grammarAccess.getDeleteViewAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteView"


    // $ANTLR start "entryRuleRemove"
    // InternalSiriusTextDsl.g:3077:1: entryRuleRemove returns [EObject current=null] : iv_ruleRemove= ruleRemove EOF ;
    public final EObject entryRuleRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemove = null;


        try {
            // InternalSiriusTextDsl.g:3078:2: (iv_ruleRemove= ruleRemove EOF )
            // InternalSiriusTextDsl.g:3079:2: iv_ruleRemove= ruleRemove EOF
            {
             newCompositeNode(grammarAccess.getRemoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemove=ruleRemove();

            state._fsp--;

             current =iv_ruleRemove; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRemove"


    // $ANTLR start "ruleRemove"
    // InternalSiriusTextDsl.g:3086:1: ruleRemove returns [EObject current=null] : ( () otherlv_1= 'remove' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleRemove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3089:28: ( ( () otherlv_1= 'remove' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? ) )
            // InternalSiriusTextDsl.g:3090:1: ( () otherlv_1= 'remove' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? )
            {
            // InternalSiriusTextDsl.g:3090:1: ( () otherlv_1= 'remove' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? )
            // InternalSiriusTextDsl.g:3090:2: () otherlv_1= 'remove' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )?
            {
            // InternalSiriusTextDsl.g:3090:2: ()
            // InternalSiriusTextDsl.g:3091:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRemoveAccess().getRemoveAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,74,FOLLOW_72); 

                	newLeafNode(otherlv_1, grammarAccess.getRemoveAccess().getRemoveKeyword_1());
                
            otherlv_2=(Token)match(input,73,FOLLOW_58); 

                	newLeafNode(otherlv_2, grammarAccess.getRemoveAccess().getLeftParenthesisRightParenthesisKeyword_2());
                
            // InternalSiriusTextDsl.g:3104:1: (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==16) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalSiriusTextDsl.g:3104:3: otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_57); 

                        	newLeafNode(otherlv_3, grammarAccess.getRemoveAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:3108:1: ( (lv_body_4_0= ruleOperation ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==33||LA78_0==55||(LA78_0>=57 && LA78_0<=58)||LA78_0==61||LA78_0==63||LA78_0==66||LA78_0==69||LA78_0==72||(LA78_0>=74 && LA78_0<=75)||LA78_0==77) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:3109:1: (lv_body_4_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:3109:1: (lv_body_4_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:3110:3: lv_body_4_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRemoveAccess().getBodyOperationParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_57);
                    	    lv_body_4_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRemoveRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_4_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_2); 

                        	newLeafNode(otherlv_5, grammarAccess.getRemoveAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRemove"


    // $ANTLR start "entryRuleMove"
    // InternalSiriusTextDsl.g:3138:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalSiriusTextDsl.g:3139:2: (iv_ruleMove= ruleMove EOF )
            // InternalSiriusTextDsl.g:3140:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalSiriusTextDsl.g:3147:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' otherlv_1= '(' otherlv_2= 'newContainerExpression' otherlv_3= ':' ( (lv_newContainerExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= ',' otherlv_6= 'featureName' otherlv_7= ':' ( (lv_featureName_8_0= RULE_STRING ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_newContainerExpression_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_featureName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_body_11_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3150:28: ( (otherlv_0= 'move' otherlv_1= '(' otherlv_2= 'newContainerExpression' otherlv_3= ':' ( (lv_newContainerExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= ',' otherlv_6= 'featureName' otherlv_7= ':' ( (lv_featureName_8_0= RULE_STRING ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? ) )
            // InternalSiriusTextDsl.g:3151:1: (otherlv_0= 'move' otherlv_1= '(' otherlv_2= 'newContainerExpression' otherlv_3= ':' ( (lv_newContainerExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= ',' otherlv_6= 'featureName' otherlv_7= ':' ( (lv_featureName_8_0= RULE_STRING ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? )
            {
            // InternalSiriusTextDsl.g:3151:1: (otherlv_0= 'move' otherlv_1= '(' otherlv_2= 'newContainerExpression' otherlv_3= ':' ( (lv_newContainerExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= ',' otherlv_6= 'featureName' otherlv_7= ':' ( (lv_featureName_8_0= RULE_STRING ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? )
            // InternalSiriusTextDsl.g:3151:3: otherlv_0= 'move' otherlv_1= '(' otherlv_2= 'newContainerExpression' otherlv_3= ':' ( (lv_newContainerExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= ',' otherlv_6= 'featureName' otherlv_7= ':' ( (lv_featureName_8_0= RULE_STRING ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,75,FOLLOW_48); 

                	newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
                
            otherlv_1=(Token)match(input,48,FOLLOW_73); 

                	newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,76,FOLLOW_59); 

                	newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getNewContainerExpressionKeyword_2());
                
            otherlv_3=(Token)match(input,56,FOLLOW_32); 

                	newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:3167:1: ( (lv_newContainerExpression_4_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:3168:1: (lv_newContainerExpression_4_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:3168:1: (lv_newContainerExpression_4_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:3169:3: lv_newContainerExpression_4_0= RULE_EXPRESSION
            {
            lv_newContainerExpression_4_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_61); 

            			newLeafNode(lv_newContainerExpression_4_0, grammarAccess.getMoveAccess().getNewContainerExpressionEXPRESSIONTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"newContainerExpression",
                    		lv_newContainerExpression_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_60); 

                	newLeafNode(otherlv_5, grammarAccess.getMoveAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,59,FOLLOW_59); 

                	newLeafNode(otherlv_6, grammarAccess.getMoveAccess().getFeatureNameKeyword_6());
                
            otherlv_7=(Token)match(input,56,FOLLOW_10); 

                	newLeafNode(otherlv_7, grammarAccess.getMoveAccess().getColonKeyword_7());
                
            // InternalSiriusTextDsl.g:3197:1: ( (lv_featureName_8_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:3198:1: (lv_featureName_8_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:3198:1: (lv_featureName_8_0= RULE_STRING )
            // InternalSiriusTextDsl.g:3199:3: lv_featureName_8_0= RULE_STRING
            {
            lv_featureName_8_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

            			newLeafNode(lv_featureName_8_0, grammarAccess.getMoveAccess().getFeatureNameSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"featureName",
                    		lv_featureName_8_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,49,FOLLOW_58); 

                	newLeafNode(otherlv_9, grammarAccess.getMoveAccess().getRightParenthesisKeyword_9());
                
            // InternalSiriusTextDsl.g:3219:1: (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==16) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalSiriusTextDsl.g:3219:3: otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_57); 

                        	newLeafNode(otherlv_10, grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_10_0());
                        
                    // InternalSiriusTextDsl.g:3223:1: ( (lv_body_11_0= ruleOperation ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==33||LA80_0==55||(LA80_0>=57 && LA80_0<=58)||LA80_0==61||LA80_0==63||LA80_0==66||LA80_0==69||LA80_0==72||(LA80_0>=74 && LA80_0<=75)||LA80_0==77) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:3224:1: (lv_body_11_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:3224:1: (lv_body_11_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:3225:3: lv_body_11_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMoveAccess().getBodyOperationParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_57);
                    	    lv_body_11_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMoveRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_11_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_2); 

                        	newLeafNode(otherlv_12, grammarAccess.getMoveAccess().getRightCurlyBracketKeyword_10_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleSwitch"
    // InternalSiriusTextDsl.g:3253:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // InternalSiriusTextDsl.g:3254:2: (iv_ruleSwitch= ruleSwitch EOF )
            // InternalSiriusTextDsl.g:3255:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitch"


    // $ANTLR start "ruleSwitch"
    // InternalSiriusTextDsl.g:3262:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_cases_2_0 = null;

        EObject lv_default_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3265:28: ( (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' ) )
            // InternalSiriusTextDsl.g:3266:1: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' )
            {
            // InternalSiriusTextDsl.g:3266:1: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' )
            // InternalSiriusTextDsl.g:3266:3: otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_11); 

                	newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_74); 

                	newLeafNode(otherlv_1, grammarAccess.getSwitchAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalSiriusTextDsl.g:3274:1: ( (lv_cases_2_0= ruleCase ) )+
            int cnt82=0;
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==78) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3275:1: (lv_cases_2_0= ruleCase )
            	    {
            	    // InternalSiriusTextDsl.g:3275:1: (lv_cases_2_0= ruleCase )
            	    // InternalSiriusTextDsl.g:3276:3: lv_cases_2_0= ruleCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSwitchAccess().getCasesCaseParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_75);
            	    lv_cases_2_0=ruleCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSwitchRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cases",
            	            		lv_cases_2_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Case");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt82 >= 1 ) break loop82;
                        EarlyExitException eee =
                            new EarlyExitException(82, input);
                        throw eee;
                }
                cnt82++;
            } while (true);

            // InternalSiriusTextDsl.g:3292:3: ( (lv_default_3_0= ruleDefault ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==79) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalSiriusTextDsl.g:3293:1: (lv_default_3_0= ruleDefault )
                    {
                    // InternalSiriusTextDsl.g:3293:1: (lv_default_3_0= ruleDefault )
                    // InternalSiriusTextDsl.g:3294:3: lv_default_3_0= ruleDefault
                    {
                     
                    	        newCompositeNode(grammarAccess.getSwitchAccess().getDefaultDefaultParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_21);
                    lv_default_3_0=ruleDefault();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSwitchRule());
                    	        }
                           		set(
                           			current, 
                           			"default",
                            		lv_default_3_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.Default");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitch"


    // $ANTLR start "entryRuleCase"
    // InternalSiriusTextDsl.g:3322:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalSiriusTextDsl.g:3323:2: (iv_ruleCase= ruleCase EOF )
            // InternalSiriusTextDsl.g:3324:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalSiriusTextDsl.g:3331:1: ruleCase returns [EObject current=null] : (otherlv_0= 'case' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_conditionExpression_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3334:28: ( (otherlv_0= 'case' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' ) )
            // InternalSiriusTextDsl.g:3335:1: (otherlv_0= 'case' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )
            {
            // InternalSiriusTextDsl.g:3335:1: (otherlv_0= 'case' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )
            // InternalSiriusTextDsl.g:3335:3: otherlv_0= 'case' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_48); 

                	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getCaseKeyword_0());
                
            otherlv_1=(Token)match(input,48,FOLLOW_32); 

                	newLeafNode(otherlv_1, grammarAccess.getCaseAccess().getLeftParenthesisKeyword_1());
                
            // InternalSiriusTextDsl.g:3343:1: ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:3344:1: (lv_conditionExpression_2_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:3344:1: (lv_conditionExpression_2_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:3345:3: lv_conditionExpression_2_0= RULE_EXPRESSION
            {
            lv_conditionExpression_2_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_49); 

            			newLeafNode(lv_conditionExpression_2_0, grammarAccess.getCaseAccess().getConditionExpressionEXPRESSIONTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"conditionExpression",
                    		lv_conditionExpression_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_11); 

                	newLeafNode(otherlv_3, grammarAccess.getCaseAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_57); 

                	newLeafNode(otherlv_4, grammarAccess.getCaseAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSiriusTextDsl.g:3369:1: ( (lv_body_5_0= ruleOperation ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==33||LA84_0==55||(LA84_0>=57 && LA84_0<=58)||LA84_0==61||LA84_0==63||LA84_0==66||LA84_0==69||LA84_0==72||(LA84_0>=74 && LA84_0<=75)||LA84_0==77) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3370:1: (lv_body_5_0= ruleOperation )
            	    {
            	    // InternalSiriusTextDsl.g:3370:1: (lv_body_5_0= ruleOperation )
            	    // InternalSiriusTextDsl.g:3371:3: lv_body_5_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCaseAccess().getBodyOperationParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_57);
            	    lv_body_5_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_5_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getCaseAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleDefault"
    // InternalSiriusTextDsl.g:3399:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // InternalSiriusTextDsl.g:3400:2: (iv_ruleDefault= ruleDefault EOF )
            // InternalSiriusTextDsl.g:3401:2: iv_ruleDefault= ruleDefault EOF
            {
             newCompositeNode(grammarAccess.getDefaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefault=ruleDefault();

            state._fsp--;

             current =iv_ruleDefault; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // InternalSiriusTextDsl.g:3408:1: ruleDefault returns [EObject current=null] : ( () otherlv_1= 'default' otherlv_2= '{' ( (lv_body_3_0= ruleOperation ) )* otherlv_4= '}' ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3411:28: ( ( () otherlv_1= 'default' otherlv_2= '{' ( (lv_body_3_0= ruleOperation ) )* otherlv_4= '}' ) )
            // InternalSiriusTextDsl.g:3412:1: ( () otherlv_1= 'default' otherlv_2= '{' ( (lv_body_3_0= ruleOperation ) )* otherlv_4= '}' )
            {
            // InternalSiriusTextDsl.g:3412:1: ( () otherlv_1= 'default' otherlv_2= '{' ( (lv_body_3_0= ruleOperation ) )* otherlv_4= '}' )
            // InternalSiriusTextDsl.g:3412:2: () otherlv_1= 'default' otherlv_2= '{' ( (lv_body_3_0= ruleOperation ) )* otherlv_4= '}'
            {
            // InternalSiriusTextDsl.g:3412:2: ()
            // InternalSiriusTextDsl.g:3413:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDefaultAccess().getDefaultAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,79,FOLLOW_11); 

                	newLeafNode(otherlv_1, grammarAccess.getDefaultAccess().getDefaultKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_57); 

                	newLeafNode(otherlv_2, grammarAccess.getDefaultAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalSiriusTextDsl.g:3426:1: ( (lv_body_3_0= ruleOperation ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==33||LA85_0==55||(LA85_0>=57 && LA85_0<=58)||LA85_0==61||LA85_0==63||LA85_0==66||LA85_0==69||LA85_0==72||(LA85_0>=74 && LA85_0<=75)||LA85_0==77) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3427:1: (lv_body_3_0= ruleOperation )
            	    {
            	    // InternalSiriusTextDsl.g:3427:1: (lv_body_3_0= ruleOperation )
            	    // InternalSiriusTextDsl.g:3428:3: lv_body_3_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDefaultAccess().getBodyOperationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_57);
            	    lv_body_3_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDefaultRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_3_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getDefaultAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRuleMapping"
    // InternalSiriusTextDsl.g:3456:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalSiriusTextDsl.g:3457:2: (iv_ruleMapping= ruleMapping EOF )
            // InternalSiriusTextDsl.g:3458:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalSiriusTextDsl.g:3465:1: ruleMapping returns [EObject current=null] : this_Container_0= ruleContainer ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        EObject this_Container_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3468:28: (this_Container_0= ruleContainer )
            // InternalSiriusTextDsl.g:3470:5: this_Container_0= ruleContainer
            {
             
                    newCompositeNode(grammarAccess.getMappingAccess().getContainerParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_Container_0=ruleContainer();

            state._fsp--;

             
                    current = this_Container_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleContainer"
    // InternalSiriusTextDsl.g:3486:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalSiriusTextDsl.g:3487:2: (iv_ruleContainer= ruleContainer EOF )
            // InternalSiriusTextDsl.g:3488:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalSiriusTextDsl.g:3495:1: ruleContainer returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token lv_list_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_label_5_0=null;
        Token otherlv_6=null;
        Token lv_domainClass_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_precondition_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_semanticCanditatesExpression_15_0=null;
        Token otherlv_17=null;
        EObject lv_conditionalStyles_16_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3498:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}' ) )
            // InternalSiriusTextDsl.g:3499:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}' )
            {
            // InternalSiriusTextDsl.g:3499:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}' )
            // InternalSiriusTextDsl.g:3499:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}'
            {
            // InternalSiriusTextDsl.g:3499:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_DOCUMENTATION) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalSiriusTextDsl.g:3500:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:3500:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:3501:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_76); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getContainerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:3517:3: ( (lv_list_1_0= 'list' ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==80) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalSiriusTextDsl.g:3518:1: (lv_list_1_0= 'list' )
                    {
                    // InternalSiriusTextDsl.g:3518:1: (lv_list_1_0= 'list' )
                    // InternalSiriusTextDsl.g:3519:3: lv_list_1_0= 'list'
                    {
                    lv_list_1_0=(Token)match(input,80,FOLLOW_77); 

                            newLeafNode(lv_list_1_0, grammarAccess.getContainerAccess().getListListKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(current, "list", true, "list");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,81,FOLLOW_4); 

                	newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getContainerKeyword_2());
                
            // InternalSiriusTextDsl.g:3536:1: ( (lv_name_3_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:3537:1: (lv_name_3_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:3537:1: (lv_name_3_0= RULE_ID )
            // InternalSiriusTextDsl.g:3538:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            			newLeafNode(lv_name_3_0, grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:3554:2: (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==15) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalSiriusTextDsl.g:3554:4: otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getAsKeyword_4_0());
                        
                    // InternalSiriusTextDsl.g:3558:1: ( (lv_label_5_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:3559:1: (lv_label_5_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:3559:1: (lv_label_5_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:3560:3: lv_label_5_0= RULE_STRING
                    {
                    lv_label_5_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    			newLeafNode(lv_label_5_0, grammarAccess.getContainerAccess().getLabelSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_5_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_10); 

                	newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getForKeyword_5());
                
            // InternalSiriusTextDsl.g:3580:1: ( (lv_domainClass_7_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:3581:1: (lv_domainClass_7_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:3581:1: (lv_domainClass_7_0= RULE_STRING )
            // InternalSiriusTextDsl.g:3582:3: lv_domainClass_7_0= RULE_STRING
            {
            lv_domainClass_7_0=(Token)match(input,RULE_STRING,FOLLOW_78); 

            			newLeafNode(lv_domainClass_7_0, grammarAccess.getContainerAccess().getDomainClassSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"domainClass",
                    		lv_domainClass_7_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,82,FOLLOW_4); 

                	newLeafNode(otherlv_8, grammarAccess.getContainerAccess().getStyleKeyword_7());
                
            // InternalSiriusTextDsl.g:3602:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:3603:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:3603:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:3604:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContainerAccess().getStyleContainerStyleCrossReference_8_0()); 
            	    
            pushFollow(FOLLOW_31);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:3617:2: (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==34) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalSiriusTextDsl.g:3617:4: otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) )
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_32); 

                        	newLeafNode(otherlv_10, grammarAccess.getContainerAccess().getQuestionMarkKeyword_9_0());
                        
                    // InternalSiriusTextDsl.g:3621:1: ( (lv_precondition_11_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:3622:1: (lv_precondition_11_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:3622:1: (lv_precondition_11_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:3623:3: lv_precondition_11_0= RULE_EXPRESSION
                    {
                    lv_precondition_11_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_11); 

                    			newLeafNode(lv_precondition_11_0, grammarAccess.getContainerAccess().getPreconditionEXPRESSIONTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"precondition",
                            		lv_precondition_11_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_79); 

                	newLeafNode(otherlv_12, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_10());
                
            // InternalSiriusTextDsl.g:3643:1: (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==83) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalSiriusTextDsl.g:3643:3: otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) )
                    {
                    otherlv_13=(Token)match(input,83,FOLLOW_15); 

                        	newLeafNode(otherlv_13, grammarAccess.getContainerAccess().getSemanticCandidatesExpressionKeyword_11_0());
                        
                    otherlv_14=(Token)match(input,20,FOLLOW_32); 

                        	newLeafNode(otherlv_14, grammarAccess.getContainerAccess().getEqualsSignKeyword_11_1());
                        
                    // InternalSiriusTextDsl.g:3651:1: ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:3652:1: (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:3652:1: (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:3653:3: lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION
                    {
                    lv_semanticCanditatesExpression_15_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_80); 

                    			newLeafNode(lv_semanticCanditatesExpression_15_0, grammarAccess.getContainerAccess().getSemanticCanditatesExpressionEXPRESSIONTerminalRuleCall_11_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"semanticCanditatesExpression",
                            		lv_semanticCanditatesExpression_15_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:3669:4: ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==82) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3670:1: (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration )
            	    {
            	    // InternalSiriusTextDsl.g:3670:1: (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration )
            	    // InternalSiriusTextDsl.g:3671:3: lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getConditionalStylesConditionalContainerStyleDeclarationParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_80);
            	    lv_conditionalStyles_16_0=ruleConditionalContainerStyleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conditionalStyles",
            	            		lv_conditionalStyles_16_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.ConditionalContainerStyleDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            otherlv_17=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_17, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleConditionalContainerStyleDeclaration"
    // InternalSiriusTextDsl.g:3699:1: entryRuleConditionalContainerStyleDeclaration returns [EObject current=null] : iv_ruleConditionalContainerStyleDeclaration= ruleConditionalContainerStyleDeclaration EOF ;
    public final EObject entryRuleConditionalContainerStyleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalContainerStyleDeclaration = null;


        try {
            // InternalSiriusTextDsl.g:3700:2: (iv_ruleConditionalContainerStyleDeclaration= ruleConditionalContainerStyleDeclaration EOF )
            // InternalSiriusTextDsl.g:3701:2: iv_ruleConditionalContainerStyleDeclaration= ruleConditionalContainerStyleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getConditionalContainerStyleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalContainerStyleDeclaration=ruleConditionalContainerStyleDeclaration();

            state._fsp--;

             current =iv_ruleConditionalContainerStyleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalContainerStyleDeclaration"


    // $ANTLR start "ruleConditionalContainerStyleDeclaration"
    // InternalSiriusTextDsl.g:3708:1: ruleConditionalContainerStyleDeclaration returns [EObject current=null] : (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) ) ;
    public final EObject ruleConditionalContainerStyleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_conditionalStyleExpression_3_0=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3711:28: ( (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) ) )
            // InternalSiriusTextDsl.g:3712:1: (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) )
            {
            // InternalSiriusTextDsl.g:3712:1: (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) )
            // InternalSiriusTextDsl.g:3712:3: otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleKeyword_0());
                
            // InternalSiriusTextDsl.g:3716:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:3717:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:3717:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:3718:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionalContainerStyleDeclarationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleContainerStyleCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_81);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,57,FOLLOW_32); 

                	newLeafNode(otherlv_2, grammarAccess.getConditionalContainerStyleDeclarationAccess().getIfKeyword_2());
                
            // InternalSiriusTextDsl.g:3735:1: ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:3736:1: (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:3736:1: (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:3737:3: lv_conditionalStyleExpression_3_0= RULE_EXPRESSION
            {
            lv_conditionalStyleExpression_3_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_2); 

            			newLeafNode(lv_conditionalStyleExpression_3_0, grammarAccess.getConditionalContainerStyleDeclarationAccess().getConditionalStyleExpressionEXPRESSIONTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionalContainerStyleDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"conditionalStyleExpression",
                    		lv_conditionalStyleExpression_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalContainerStyleDeclaration"


    // $ANTLR start "entryRuleStyle"
    // InternalSiriusTextDsl.g:3761:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // InternalSiriusTextDsl.g:3762:2: (iv_ruleStyle= ruleStyle EOF )
            // InternalSiriusTextDsl.g:3763:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStyle"


    // $ANTLR start "ruleStyle"
    // InternalSiriusTextDsl.g:3770:1: ruleStyle returns [EObject current=null] : (this_ContainerStyle_0= ruleContainerStyle | this_EdgeStyle_1= ruleEdgeStyle ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        EObject this_ContainerStyle_0 = null;

        EObject this_EdgeStyle_1 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3773:28: ( (this_ContainerStyle_0= ruleContainerStyle | this_EdgeStyle_1= ruleEdgeStyle ) )
            // InternalSiriusTextDsl.g:3774:1: (this_ContainerStyle_0= ruleContainerStyle | this_EdgeStyle_1= ruleEdgeStyle )
            {
            // InternalSiriusTextDsl.g:3774:1: (this_ContainerStyle_0= ruleContainerStyle | this_EdgeStyle_1= ruleEdgeStyle )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_DOCUMENTATION||LA92_0==84) ) {
                alt92=1;
            }
            else if ( (LA92_0==97) ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // InternalSiriusTextDsl.g:3775:5: this_ContainerStyle_0= ruleContainerStyle
                    {
                     
                            newCompositeNode(grammarAccess.getStyleAccess().getContainerStyleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ContainerStyle_0=ruleContainerStyle();

                    state._fsp--;

                     
                            current = this_ContainerStyle_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:3785:5: this_EdgeStyle_1= ruleEdgeStyle
                    {
                     
                            newCompositeNode(grammarAccess.getStyleAccess().getEdgeStyleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_EdgeStyle_1=ruleEdgeStyle();

                    state._fsp--;

                     
                            current = this_EdgeStyle_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStyle"


    // $ANTLR start "entryRuleContainerStyle"
    // InternalSiriusTextDsl.g:3801:1: entryRuleContainerStyle returns [EObject current=null] : iv_ruleContainerStyle= ruleContainerStyle EOF ;
    public final EObject entryRuleContainerStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerStyle = null;


        try {
            // InternalSiriusTextDsl.g:3802:2: (iv_ruleContainerStyle= ruleContainerStyle EOF )
            // InternalSiriusTextDsl.g:3803:2: iv_ruleContainerStyle= ruleContainerStyle EOF
            {
             newCompositeNode(grammarAccess.getContainerStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainerStyle=ruleContainerStyle();

            state._fsp--;

             current =iv_ruleContainerStyle; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerStyle"


    // $ANTLR start "ruleContainerStyle"
    // InternalSiriusTextDsl.g:3810:1: ruleContainerStyle returns [EObject current=null] : this_Gradient_0= ruleGradient ;
    public final EObject ruleContainerStyle() throws RecognitionException {
        EObject current = null;

        EObject this_Gradient_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3813:28: (this_Gradient_0= ruleGradient )
            // InternalSiriusTextDsl.g:3815:5: this_Gradient_0= ruleGradient
            {
             
                    newCompositeNode(grammarAccess.getContainerStyleAccess().getGradientParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_Gradient_0=ruleGradient();

            state._fsp--;

             
                    current = this_Gradient_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerStyle"


    // $ANTLR start "entryRuleGradient"
    // InternalSiriusTextDsl.g:3831:1: entryRuleGradient returns [EObject current=null] : iv_ruleGradient= ruleGradient EOF ;
    public final EObject entryRuleGradient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGradient = null;


        try {
            // InternalSiriusTextDsl.g:3832:2: (iv_ruleGradient= ruleGradient EOF )
            // InternalSiriusTextDsl.g:3833:2: iv_ruleGradient= ruleGradient EOF
            {
             newCompositeNode(grammarAccess.getGradientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGradient=ruleGradient();

            state._fsp--;

             current =iv_ruleGradient; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGradient"


    // $ANTLR start "ruleGradient"
    // InternalSiriusTextDsl.g:3840:1: ruleGradient returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) ) )? (otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}' ) ;
    public final EObject ruleGradient() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_labelExpression_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_borderSize_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_icon_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_heightComputationExpression_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_widthComputationExpression_28_0=null;
        Token otherlv_29=null;
        Enumerator lv_direction_2_0 = null;

        Enumerator lv_labelAlignment_10_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3843:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) ) )? (otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}' ) )
            // InternalSiriusTextDsl.g:3844:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) ) )? (otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}' )
            {
            // InternalSiriusTextDsl.g:3844:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) ) )? (otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}' )
            // InternalSiriusTextDsl.g:3844:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) ) )? (otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}'
            {
            // InternalSiriusTextDsl.g:3844:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_DOCUMENTATION) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalSiriusTextDsl.g:3845:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:3845:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:3846:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_82); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getGradientAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,84,FOLLOW_83); 

                	newLeafNode(otherlv_1, grammarAccess.getGradientAccess().getGradientKeyword_1());
                
            // InternalSiriusTextDsl.g:3866:1: ( (lv_direction_2_0= ruleGradientDirection ) )
            // InternalSiriusTextDsl.g:3867:1: (lv_direction_2_0= ruleGradientDirection )
            {
            // InternalSiriusTextDsl.g:3867:1: (lv_direction_2_0= ruleGradientDirection )
            // InternalSiriusTextDsl.g:3868:3: lv_direction_2_0= ruleGradientDirection
            {
             
            	        newCompositeNode(grammarAccess.getGradientAccess().getDirectionGradientDirectionEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_4);
            lv_direction_2_0=ruleGradientDirection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGradientRule());
            	        }
                   		set(
                   			current, 
                   			"direction",
                    		lv_direction_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.GradientDirection");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:3884:2: ( (lv_name_3_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:3885:1: (lv_name_3_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:3885:1: (lv_name_3_0= RULE_ID )
            // InternalSiriusTextDsl.g:3886:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_84); 

            			newLeafNode(lv_name_3_0, grammarAccess.getGradientAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGradientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,85,FOLLOW_4); 

                	newLeafNode(otherlv_4, grammarAccess.getGradientAccess().getFromKeyword_4());
                
            // InternalSiriusTextDsl.g:3906:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:3907:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:3907:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:3908:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGradientRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGradientAccess().getBackgroundColorColorCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_85);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,86,FOLLOW_4); 

                	newLeafNode(otherlv_6, grammarAccess.getGradientAccess().getToKeyword_6());
                
            // InternalSiriusTextDsl.g:3925:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:3926:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:3926:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:3927:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGradientRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGradientAccess().getForegroundColorColorCrossReference_7_0()); 
            	    
            pushFollow(FOLLOW_11);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_86); 

                	newLeafNode(otherlv_8, grammarAccess.getGradientAccess().getLeftCurlyBracketKeyword_8());
                
            // InternalSiriusTextDsl.g:3944:1: (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==87) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalSiriusTextDsl.g:3944:3: otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) )
                    {
                    otherlv_9=(Token)match(input,87,FOLLOW_87); 

                        	newLeafNode(otherlv_9, grammarAccess.getGradientAccess().getLabelKeyword_9_0());
                        
                    // InternalSiriusTextDsl.g:3948:1: ( (lv_labelAlignment_10_0= ruleLabelAlignment ) )
                    // InternalSiriusTextDsl.g:3949:1: (lv_labelAlignment_10_0= ruleLabelAlignment )
                    {
                    // InternalSiriusTextDsl.g:3949:1: (lv_labelAlignment_10_0= ruleLabelAlignment )
                    // InternalSiriusTextDsl.g:3950:3: lv_labelAlignment_10_0= ruleLabelAlignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getGradientAccess().getLabelAlignmentLabelAlignmentEnumRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_32);
                    lv_labelAlignment_10_0=ruleLabelAlignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGradientRule());
                    	        }
                           		set(
                           			current, 
                           			"labelAlignment",
                            		lv_labelAlignment_10_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.LabelAlignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:3966:2: ( (lv_labelExpression_11_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:3967:1: (lv_labelExpression_11_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:3967:1: (lv_labelExpression_11_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:3968:3: lv_labelExpression_11_0= RULE_EXPRESSION
                    {
                    lv_labelExpression_11_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_88); 

                    			newLeafNode(lv_labelExpression_11_0, grammarAccess.getGradientAccess().getLabelExpressionEXPRESSIONTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"labelExpression",
                            		lv_labelExpression_11_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,88,FOLLOW_4); 

                        	newLeafNode(otherlv_12, grammarAccess.getGradientAccess().getInKeyword_9_3());
                        
                    // InternalSiriusTextDsl.g:3988:1: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:3989:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:3989:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:3990:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getGradientAccess().getLabelColorColorCrossReference_9_4_0()); 
                    	    
                    pushFollow(FOLLOW_89);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4003:4: (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==89) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalSiriusTextDsl.g:4003:6: otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) )
                    {
                    otherlv_14=(Token)match(input,89,FOLLOW_90); 

                        	newLeafNode(otherlv_14, grammarAccess.getGradientAccess().getBorderKeyword_10_0());
                        
                    otherlv_15=(Token)match(input,90,FOLLOW_15); 

                        	newLeafNode(otherlv_15, grammarAccess.getGradientAccess().getSizeKeyword_10_1());
                        
                    otherlv_16=(Token)match(input,20,FOLLOW_91); 

                        	newLeafNode(otherlv_16, grammarAccess.getGradientAccess().getEqualsSignKeyword_10_2());
                        
                    // InternalSiriusTextDsl.g:4015:1: ( (lv_borderSize_17_0= RULE_INT ) )
                    // InternalSiriusTextDsl.g:4016:1: (lv_borderSize_17_0= RULE_INT )
                    {
                    // InternalSiriusTextDsl.g:4016:1: (lv_borderSize_17_0= RULE_INT )
                    // InternalSiriusTextDsl.g:4017:3: lv_borderSize_17_0= RULE_INT
                    {
                    lv_borderSize_17_0=(Token)match(input,RULE_INT,FOLLOW_88); 

                    			newLeafNode(lv_borderSize_17_0, grammarAccess.getGradientAccess().getBorderSizeINTTerminalRuleCall_10_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"borderSize",
                            		lv_borderSize_17_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,88,FOLLOW_4); 

                        	newLeafNode(otherlv_18, grammarAccess.getGradientAccess().getInKeyword_10_4());
                        
                    // InternalSiriusTextDsl.g:4037:1: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:4038:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:4038:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:4039:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getGradientAccess().getBorderColorColorCrossReference_10_5_0()); 
                    	    
                    pushFollow(FOLLOW_92);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4052:4: (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==24) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalSiriusTextDsl.g:4052:6: otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) )
                    {
                    otherlv_20=(Token)match(input,24,FOLLOW_15); 

                        	newLeafNode(otherlv_20, grammarAccess.getGradientAccess().getIconKeyword_11_0());
                        
                    otherlv_21=(Token)match(input,20,FOLLOW_10); 

                        	newLeafNode(otherlv_21, grammarAccess.getGradientAccess().getEqualsSignKeyword_11_1());
                        
                    // InternalSiriusTextDsl.g:4060:1: ( (lv_icon_22_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:4061:1: (lv_icon_22_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:4061:1: (lv_icon_22_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:4062:3: lv_icon_22_0= RULE_STRING
                    {
                    lv_icon_22_0=(Token)match(input,RULE_STRING,FOLLOW_93); 

                    			newLeafNode(lv_icon_22_0, grammarAccess.getGradientAccess().getIconSTRINGTerminalRuleCall_11_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_22_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4078:4: (otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==91) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalSiriusTextDsl.g:4078:6: otherlv_23= 'heightComputationExpression' otherlv_24= '=' ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) )
                    {
                    otherlv_23=(Token)match(input,91,FOLLOW_15); 

                        	newLeafNode(otherlv_23, grammarAccess.getGradientAccess().getHeightComputationExpressionKeyword_12_0());
                        
                    otherlv_24=(Token)match(input,20,FOLLOW_32); 

                        	newLeafNode(otherlv_24, grammarAccess.getGradientAccess().getEqualsSignKeyword_12_1());
                        
                    // InternalSiriusTextDsl.g:4086:1: ( (lv_heightComputationExpression_25_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:4087:1: (lv_heightComputationExpression_25_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:4087:1: (lv_heightComputationExpression_25_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:4088:3: lv_heightComputationExpression_25_0= RULE_EXPRESSION
                    {
                    lv_heightComputationExpression_25_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_94); 

                    			newLeafNode(lv_heightComputationExpression_25_0, grammarAccess.getGradientAccess().getHeightComputationExpressionEXPRESSIONTerminalRuleCall_12_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"heightComputationExpression",
                            		lv_heightComputationExpression_25_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4104:4: (otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==92) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalSiriusTextDsl.g:4104:6: otherlv_26= 'widthComputationExpression' otherlv_27= '=' ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) )
                    {
                    otherlv_26=(Token)match(input,92,FOLLOW_15); 

                        	newLeafNode(otherlv_26, grammarAccess.getGradientAccess().getWidthComputationExpressionKeyword_13_0());
                        
                    otherlv_27=(Token)match(input,20,FOLLOW_32); 

                        	newLeafNode(otherlv_27, grammarAccess.getGradientAccess().getEqualsSignKeyword_13_1());
                        
                    // InternalSiriusTextDsl.g:4112:1: ( (lv_widthComputationExpression_28_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:4113:1: (lv_widthComputationExpression_28_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:4113:1: (lv_widthComputationExpression_28_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:4114:3: lv_widthComputationExpression_28_0= RULE_EXPRESSION
                    {
                    lv_widthComputationExpression_28_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_21); 

                    			newLeafNode(lv_widthComputationExpression_28_0, grammarAccess.getGradientAccess().getWidthComputationExpressionEXPRESSIONTerminalRuleCall_13_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"widthComputationExpression",
                            		lv_widthComputationExpression_28_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_29=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_29, grammarAccess.getGradientAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGradient"


    // $ANTLR start "entryRuleEdge"
    // InternalSiriusTextDsl.g:4142:1: entryRuleEdge returns [EObject current=null] : iv_ruleEdge= ruleEdge EOF ;
    public final EObject entryRuleEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdge = null;


        try {
            // InternalSiriusTextDsl.g:4143:2: (iv_ruleEdge= ruleEdge EOF )
            // InternalSiriusTextDsl.g:4144:2: iv_ruleEdge= ruleEdge EOF
            {
             newCompositeNode(grammarAccess.getEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdge=ruleEdge();

            state._fsp--;

             current =iv_ruleEdge; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalSiriusTextDsl.g:4151:1: ruleEdge returns [EObject current=null] : this_RelationBasedEdge_0= ruleRelationBasedEdge ;
    public final EObject ruleEdge() throws RecognitionException {
        EObject current = null;

        EObject this_RelationBasedEdge_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4154:28: (this_RelationBasedEdge_0= ruleRelationBasedEdge )
            // InternalSiriusTextDsl.g:4156:5: this_RelationBasedEdge_0= ruleRelationBasedEdge
            {
             
                    newCompositeNode(grammarAccess.getEdgeAccess().getRelationBasedEdgeParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_RelationBasedEdge_0=ruleRelationBasedEdge();

            state._fsp--;

             
                    current = this_RelationBasedEdge_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRuleRelationBasedEdge"
    // InternalSiriusTextDsl.g:4172:1: entryRuleRelationBasedEdge returns [EObject current=null] : iv_ruleRelationBasedEdge= ruleRelationBasedEdge EOF ;
    public final EObject entryRuleRelationBasedEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationBasedEdge = null;


        try {
            // InternalSiriusTextDsl.g:4173:2: (iv_ruleRelationBasedEdge= ruleRelationBasedEdge EOF )
            // InternalSiriusTextDsl.g:4174:2: iv_ruleRelationBasedEdge= ruleRelationBasedEdge EOF
            {
             newCompositeNode(grammarAccess.getRelationBasedEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationBasedEdge=ruleRelationBasedEdge();

            state._fsp--;

             current =iv_ruleRelationBasedEdge; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationBasedEdge"


    // $ANTLR start "ruleRelationBasedEdge"
    // InternalSiriusTextDsl.g:4181:1: ruleRelationBasedEdge returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) otherlv_7= '{' otherlv_8= 'sourceMappings' otherlv_9= '=' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' otherlv_15= 'targetMappings' otherlv_16= '=' otherlv_17= '[' ( ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_21= ']' otherlv_22= 'targetFileExpression' otherlv_23= '=' ( (lv_targetFinderExpression_24_0= RULE_EXPRESSION ) ) otherlv_25= '}' ) ;
    public final EObject ruleRelationBasedEdge() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_targetFinderExpression_24_0=null;
        Token otherlv_25=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4184:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) otherlv_7= '{' otherlv_8= 'sourceMappings' otherlv_9= '=' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' otherlv_15= 'targetMappings' otherlv_16= '=' otherlv_17= '[' ( ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_21= ']' otherlv_22= 'targetFileExpression' otherlv_23= '=' ( (lv_targetFinderExpression_24_0= RULE_EXPRESSION ) ) otherlv_25= '}' ) )
            // InternalSiriusTextDsl.g:4185:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) otherlv_7= '{' otherlv_8= 'sourceMappings' otherlv_9= '=' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' otherlv_15= 'targetMappings' otherlv_16= '=' otherlv_17= '[' ( ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_21= ']' otherlv_22= 'targetFileExpression' otherlv_23= '=' ( (lv_targetFinderExpression_24_0= RULE_EXPRESSION ) ) otherlv_25= '}' )
            {
            // InternalSiriusTextDsl.g:4185:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) otherlv_7= '{' otherlv_8= 'sourceMappings' otherlv_9= '=' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' otherlv_15= 'targetMappings' otherlv_16= '=' otherlv_17= '[' ( ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_21= ']' otherlv_22= 'targetFileExpression' otherlv_23= '=' ( (lv_targetFinderExpression_24_0= RULE_EXPRESSION ) ) otherlv_25= '}' )
            // InternalSiriusTextDsl.g:4185:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) otherlv_7= '{' otherlv_8= 'sourceMappings' otherlv_9= '=' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' otherlv_15= 'targetMappings' otherlv_16= '=' otherlv_17= '[' ( ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_21= ']' otherlv_22= 'targetFileExpression' otherlv_23= '=' ( (lv_targetFinderExpression_24_0= RULE_EXPRESSION ) ) otherlv_25= '}'
            {
            // InternalSiriusTextDsl.g:4185:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_DOCUMENTATION) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalSiriusTextDsl.g:4186:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:4186:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:4187:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_95); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getRelationBasedEdgeAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,93,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getRelationBasedEdgeAccess().getRelationBasedEdgeKeyword_1());
                
            // InternalSiriusTextDsl.g:4207:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:4208:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:4208:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:4209:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_96); 

            			newLeafNode(lv_name_2_0, grammarAccess.getRelationBasedEdgeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:4225:2: (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==15) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalSiriusTextDsl.g:4225:4: otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getRelationBasedEdgeAccess().getAsKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:4229:1: ( (lv_label_4_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:4230:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:4230:1: (lv_label_4_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:4231:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_78); 

                    			newLeafNode(lv_label_4_0, grammarAccess.getRelationBasedEdgeAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,82,FOLLOW_4); 

                	newLeafNode(otherlv_5, grammarAccess.getRelationBasedEdgeAccess().getStyleKeyword_4());
                
            // InternalSiriusTextDsl.g:4251:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:4252:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:4252:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:4253:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationBasedEdgeAccess().getStyleEdgeStyleCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_11);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_97); 

                	newLeafNode(otherlv_7, grammarAccess.getRelationBasedEdgeAccess().getLeftCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,94,FOLLOW_15); 

                	newLeafNode(otherlv_8, grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsKeyword_7());
                
            otherlv_9=(Token)match(input,20,FOLLOW_16); 

                	newLeafNode(otherlv_9, grammarAccess.getRelationBasedEdgeAccess().getEqualsSignKeyword_8());
                
            otherlv_10=(Token)match(input,21,FOLLOW_20); 

                	newLeafNode(otherlv_10, grammarAccess.getRelationBasedEdgeAccess().getLeftSquareBracketKeyword_9());
                
            // InternalSiriusTextDsl.g:4282:1: ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==RULE_ID) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalSiriusTextDsl.g:4282:2: ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalSiriusTextDsl.g:4282:2: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:4283:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:4283:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:4284:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsMappingCrossReference_10_0_0()); 
                    	    
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:4297:2: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==22) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:4297:4: otherlv_12= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_12=(Token)match(input,22,FOLLOW_4); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getRelationBasedEdgeAccess().getCommaKeyword_10_1_0());
                    	        
                    	    // InternalSiriusTextDsl.g:4301:1: ( ( ruleQualifiedName ) )
                    	    // InternalSiriusTextDsl.g:4302:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalSiriusTextDsl.g:4302:1: ( ruleQualifiedName )
                    	    // InternalSiriusTextDsl.g:4303:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsMappingCrossReference_10_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_17);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop101;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,23,FOLLOW_98); 

                	newLeafNode(otherlv_14, grammarAccess.getRelationBasedEdgeAccess().getRightSquareBracketKeyword_11());
                
            otherlv_15=(Token)match(input,95,FOLLOW_15); 

                	newLeafNode(otherlv_15, grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsKeyword_12());
                
            otherlv_16=(Token)match(input,20,FOLLOW_16); 

                	newLeafNode(otherlv_16, grammarAccess.getRelationBasedEdgeAccess().getEqualsSignKeyword_13());
                
            otherlv_17=(Token)match(input,21,FOLLOW_20); 

                	newLeafNode(otherlv_17, grammarAccess.getRelationBasedEdgeAccess().getLeftSquareBracketKeyword_14());
                
            // InternalSiriusTextDsl.g:4332:1: ( ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==RULE_ID) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalSiriusTextDsl.g:4332:2: ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalSiriusTextDsl.g:4332:2: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:4333:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:4333:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:4334:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsMappingCrossReference_15_0_0()); 
                    	    
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:4347:2: (otherlv_19= ',' ( ( ruleQualifiedName ) ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==22) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:4347:4: otherlv_19= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_19=(Token)match(input,22,FOLLOW_4); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getRelationBasedEdgeAccess().getCommaKeyword_15_1_0());
                    	        
                    	    // InternalSiriusTextDsl.g:4351:1: ( ( ruleQualifiedName ) )
                    	    // InternalSiriusTextDsl.g:4352:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalSiriusTextDsl.g:4352:1: ( ruleQualifiedName )
                    	    // InternalSiriusTextDsl.g:4353:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsMappingCrossReference_15_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_17);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,23,FOLLOW_99); 

                	newLeafNode(otherlv_21, grammarAccess.getRelationBasedEdgeAccess().getRightSquareBracketKeyword_16());
                
            otherlv_22=(Token)match(input,96,FOLLOW_15); 

                	newLeafNode(otherlv_22, grammarAccess.getRelationBasedEdgeAccess().getTargetFileExpressionKeyword_17());
                
            otherlv_23=(Token)match(input,20,FOLLOW_32); 

                	newLeafNode(otherlv_23, grammarAccess.getRelationBasedEdgeAccess().getEqualsSignKeyword_18());
                
            // InternalSiriusTextDsl.g:4378:1: ( (lv_targetFinderExpression_24_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:4379:1: (lv_targetFinderExpression_24_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:4379:1: (lv_targetFinderExpression_24_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:4380:3: lv_targetFinderExpression_24_0= RULE_EXPRESSION
            {
            lv_targetFinderExpression_24_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_21); 

            			newLeafNode(lv_targetFinderExpression_24_0, grammarAccess.getRelationBasedEdgeAccess().getTargetFinderExpressionEXPRESSIONTerminalRuleCall_19_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"targetFinderExpression",
                    		lv_targetFinderExpression_24_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_25=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_25, grammarAccess.getRelationBasedEdgeAccess().getRightCurlyBracketKeyword_20());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationBasedEdge"


    // $ANTLR start "entryRuleEdgeStyle"
    // InternalSiriusTextDsl.g:4408:1: entryRuleEdgeStyle returns [EObject current=null] : iv_ruleEdgeStyle= ruleEdgeStyle EOF ;
    public final EObject entryRuleEdgeStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeStyle = null;


        try {
            // InternalSiriusTextDsl.g:4409:2: (iv_ruleEdgeStyle= ruleEdgeStyle EOF )
            // InternalSiriusTextDsl.g:4410:2: iv_ruleEdgeStyle= ruleEdgeStyle EOF
            {
             newCompositeNode(grammarAccess.getEdgeStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdgeStyle=ruleEdgeStyle();

            state._fsp--;

             current =iv_ruleEdgeStyle; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdgeStyle"


    // $ANTLR start "ruleEdgeStyle"
    // InternalSiriusTextDsl.g:4417:1: ruleEdgeStyle returns [EObject current=null] : (otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' (otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) ) )? (otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) ) )? (otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) ) )? (otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) ) )? otherlv_26= '}' ) ;
    public final EObject ruleEdgeStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_sizeComputationExpression_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Enumerator lv_lineStyle_6_0 = null;

        Enumerator lv_routingStyle_9_0 = null;

        Enumerator lv_sourceArrow_13_0 = null;

        Enumerator lv_targetArrow_16_0 = null;

        Enumerator lv_foldingStyle_22_0 = null;

        Enumerator lv_endsCentering_25_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4420:28: ( (otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' (otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) ) )? (otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) ) )? (otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) ) )? (otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) ) )? otherlv_26= '}' ) )
            // InternalSiriusTextDsl.g:4421:1: (otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' (otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) ) )? (otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) ) )? (otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) ) )? (otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) ) )? otherlv_26= '}' )
            {
            // InternalSiriusTextDsl.g:4421:1: (otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' (otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) ) )? (otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) ) )? (otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) ) )? (otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) ) )? otherlv_26= '}' )
            // InternalSiriusTextDsl.g:4421:3: otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' (otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) ) )? (otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) ) )? (otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) ) )? (otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) ) )? otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,97,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getEdgeStyleAccess().getEdgeStyleKeyword_0());
                
            // InternalSiriusTextDsl.g:4425:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:4426:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:4426:1: (lv_name_1_0= RULE_ID )
            // InternalSiriusTextDsl.g:4427:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_88); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEdgeStyleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEdgeStyleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,88,FOLLOW_4); 

                	newLeafNode(otherlv_2, grammarAccess.getEdgeStyleAccess().getInKeyword_2());
                
            // InternalSiriusTextDsl.g:4447:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:4448:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:4448:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:4449:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEdgeStyleRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getStrokeColorColorCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_100);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:4462:2: (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==98) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalSiriusTextDsl.g:4462:4: otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) )
                    {
                    otherlv_4=(Token)match(input,98,FOLLOW_15); 

                        	newLeafNode(otherlv_4, grammarAccess.getEdgeStyleAccess().getLineKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,20,FOLLOW_101); 

                        	newLeafNode(otherlv_5, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_4_1());
                        
                    // InternalSiriusTextDsl.g:4470:1: ( (lv_lineStyle_6_0= ruleLineStyle ) )
                    // InternalSiriusTextDsl.g:4471:1: (lv_lineStyle_6_0= ruleLineStyle )
                    {
                    // InternalSiriusTextDsl.g:4471:1: (lv_lineStyle_6_0= ruleLineStyle )
                    // InternalSiriusTextDsl.g:4472:3: lv_lineStyle_6_0= ruleLineStyle
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getLineStyleLineStyleEnumRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_102);
                    lv_lineStyle_6_0=ruleLineStyle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"lineStyle",
                            		lv_lineStyle_6_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.LineStyle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4488:4: (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==99) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalSiriusTextDsl.g:4488:6: otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) )
                    {
                    otherlv_7=(Token)match(input,99,FOLLOW_15); 

                        	newLeafNode(otherlv_7, grammarAccess.getEdgeStyleAccess().getRoutingKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,20,FOLLOW_103); 

                        	newLeafNode(otherlv_8, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_5_1());
                        
                    // InternalSiriusTextDsl.g:4496:1: ( (lv_routingStyle_9_0= ruleRoutingStyle ) )
                    // InternalSiriusTextDsl.g:4497:1: (lv_routingStyle_9_0= ruleRoutingStyle )
                    {
                    // InternalSiriusTextDsl.g:4497:1: (lv_routingStyle_9_0= ruleRoutingStyle )
                    // InternalSiriusTextDsl.g:4498:3: lv_routingStyle_9_0= ruleRoutingStyle
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getRoutingStyleRoutingStyleEnumRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_11);
                    lv_routingStyle_9_0=ruleRoutingStyle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"routingStyle",
                            		lv_routingStyle_9_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.RoutingStyle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_104); 

                	newLeafNode(otherlv_10, grammarAccess.getEdgeStyleAccess().getLeftCurlyBracketKeyword_6());
                
            // InternalSiriusTextDsl.g:4518:1: (otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==100) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalSiriusTextDsl.g:4518:3: otherlv_11= 'sourceArrow' otherlv_12= '=' ( (lv_sourceArrow_13_0= ruleArrowDecorator ) )
                    {
                    otherlv_11=(Token)match(input,100,FOLLOW_15); 

                        	newLeafNode(otherlv_11, grammarAccess.getEdgeStyleAccess().getSourceArrowKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,20,FOLLOW_105); 

                        	newLeafNode(otherlv_12, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_7_1());
                        
                    // InternalSiriusTextDsl.g:4526:1: ( (lv_sourceArrow_13_0= ruleArrowDecorator ) )
                    // InternalSiriusTextDsl.g:4527:1: (lv_sourceArrow_13_0= ruleArrowDecorator )
                    {
                    // InternalSiriusTextDsl.g:4527:1: (lv_sourceArrow_13_0= ruleArrowDecorator )
                    // InternalSiriusTextDsl.g:4528:3: lv_sourceArrow_13_0= ruleArrowDecorator
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getSourceArrowArrowDecoratorEnumRuleCall_7_2_0()); 
                    	    
                    pushFollow(FOLLOW_106);
                    lv_sourceArrow_13_0=ruleArrowDecorator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceArrow",
                            		lv_sourceArrow_13_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.ArrowDecorator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4544:4: (otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==101) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalSiriusTextDsl.g:4544:6: otherlv_14= 'targetArrow' otherlv_15= '=' ( (lv_targetArrow_16_0= ruleArrowDecorator ) )
                    {
                    otherlv_14=(Token)match(input,101,FOLLOW_15); 

                        	newLeafNode(otherlv_14, grammarAccess.getEdgeStyleAccess().getTargetArrowKeyword_8_0());
                        
                    otherlv_15=(Token)match(input,20,FOLLOW_105); 

                        	newLeafNode(otherlv_15, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_8_1());
                        
                    // InternalSiriusTextDsl.g:4552:1: ( (lv_targetArrow_16_0= ruleArrowDecorator ) )
                    // InternalSiriusTextDsl.g:4553:1: (lv_targetArrow_16_0= ruleArrowDecorator )
                    {
                    // InternalSiriusTextDsl.g:4553:1: (lv_targetArrow_16_0= ruleArrowDecorator )
                    // InternalSiriusTextDsl.g:4554:3: lv_targetArrow_16_0= ruleArrowDecorator
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getTargetArrowArrowDecoratorEnumRuleCall_8_2_0()); 
                    	    
                    pushFollow(FOLLOW_107);
                    lv_targetArrow_16_0=ruleArrowDecorator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"targetArrow",
                            		lv_targetArrow_16_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.ArrowDecorator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4570:4: (otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==102) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalSiriusTextDsl.g:4570:6: otherlv_17= 'sizeComputationExpression' otherlv_18= '=' ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) )
                    {
                    otherlv_17=(Token)match(input,102,FOLLOW_15); 

                        	newLeafNode(otherlv_17, grammarAccess.getEdgeStyleAccess().getSizeComputationExpressionKeyword_9_0());
                        
                    otherlv_18=(Token)match(input,20,FOLLOW_32); 

                        	newLeafNode(otherlv_18, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_9_1());
                        
                    // InternalSiriusTextDsl.g:4578:1: ( (lv_sizeComputationExpression_19_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:4579:1: (lv_sizeComputationExpression_19_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:4579:1: (lv_sizeComputationExpression_19_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:4580:3: lv_sizeComputationExpression_19_0= RULE_EXPRESSION
                    {
                    lv_sizeComputationExpression_19_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_108); 

                    			newLeafNode(lv_sizeComputationExpression_19_0, grammarAccess.getEdgeStyleAccess().getSizeComputationExpressionEXPRESSIONTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEdgeStyleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"sizeComputationExpression",
                            		lv_sizeComputationExpression_19_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4596:4: (otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==103) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalSiriusTextDsl.g:4596:6: otherlv_20= 'foldingStyle' otherlv_21= '=' ( (lv_foldingStyle_22_0= ruleFoldingStyle ) )
                    {
                    otherlv_20=(Token)match(input,103,FOLLOW_15); 

                        	newLeafNode(otherlv_20, grammarAccess.getEdgeStyleAccess().getFoldingStyleKeyword_10_0());
                        
                    otherlv_21=(Token)match(input,20,FOLLOW_109); 

                        	newLeafNode(otherlv_21, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_10_1());
                        
                    // InternalSiriusTextDsl.g:4604:1: ( (lv_foldingStyle_22_0= ruleFoldingStyle ) )
                    // InternalSiriusTextDsl.g:4605:1: (lv_foldingStyle_22_0= ruleFoldingStyle )
                    {
                    // InternalSiriusTextDsl.g:4605:1: (lv_foldingStyle_22_0= ruleFoldingStyle )
                    // InternalSiriusTextDsl.g:4606:3: lv_foldingStyle_22_0= ruleFoldingStyle
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getFoldingStyleFoldingStyleEnumRuleCall_10_2_0()); 
                    	    
                    pushFollow(FOLLOW_110);
                    lv_foldingStyle_22_0=ruleFoldingStyle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"foldingStyle",
                            		lv_foldingStyle_22_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.FoldingStyle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4622:4: (otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==104) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalSiriusTextDsl.g:4622:6: otherlv_23= 'endsCentering' otherlv_24= '=' ( (lv_endsCentering_25_0= ruleEndsCentering ) )
                    {
                    otherlv_23=(Token)match(input,104,FOLLOW_15); 

                        	newLeafNode(otherlv_23, grammarAccess.getEdgeStyleAccess().getEndsCenteringKeyword_11_0());
                        
                    otherlv_24=(Token)match(input,20,FOLLOW_111); 

                        	newLeafNode(otherlv_24, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_11_1());
                        
                    // InternalSiriusTextDsl.g:4630:1: ( (lv_endsCentering_25_0= ruleEndsCentering ) )
                    // InternalSiriusTextDsl.g:4631:1: (lv_endsCentering_25_0= ruleEndsCentering )
                    {
                    // InternalSiriusTextDsl.g:4631:1: (lv_endsCentering_25_0= ruleEndsCentering )
                    // InternalSiriusTextDsl.g:4632:3: lv_endsCentering_25_0= ruleEndsCentering
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getEndsCenteringEndsCenteringEnumRuleCall_11_2_0()); 
                    	    
                    pushFollow(FOLLOW_21);
                    lv_endsCentering_25_0=ruleEndsCentering();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"endsCentering",
                            		lv_endsCentering_25_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EndsCentering");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_26, grammarAccess.getEdgeStyleAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdgeStyle"


    // $ANTLR start "entryRulePalette"
    // InternalSiriusTextDsl.g:4660:1: entryRulePalette returns [EObject current=null] : iv_rulePalette= rulePalette EOF ;
    public final EObject entryRulePalette() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePalette = null;


        try {
            // InternalSiriusTextDsl.g:4661:2: (iv_rulePalette= rulePalette EOF )
            // InternalSiriusTextDsl.g:4662:2: iv_rulePalette= rulePalette EOF
            {
             newCompositeNode(grammarAccess.getPaletteRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePalette=rulePalette();

            state._fsp--;

             current =iv_rulePalette; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePalette"


    // $ANTLR start "rulePalette"
    // InternalSiriusTextDsl.g:4669:1: rulePalette returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' ) ;
    public final EObject rulePalette() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_colors_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4672:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' ) )
            // InternalSiriusTextDsl.g:4673:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' )
            {
            // InternalSiriusTextDsl.g:4673:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' )
            // InternalSiriusTextDsl.g:4673:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}'
            {
            // InternalSiriusTextDsl.g:4673:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==RULE_DOCUMENTATION) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalSiriusTextDsl.g:4674:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:4674:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:4675:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_112); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getPaletteAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPaletteRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,105,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getPaletteAccess().getPaletteKeyword_1());
                
            // InternalSiriusTextDsl.g:4695:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:4696:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:4696:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:4697:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPaletteAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPaletteRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_113); 

                	newLeafNode(otherlv_3, grammarAccess.getPaletteAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalSiriusTextDsl.g:4717:1: ( (lv_colors_4_0= ruleColor ) )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==106) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:4718:1: (lv_colors_4_0= ruleColor )
            	    {
            	    // InternalSiriusTextDsl.g:4718:1: (lv_colors_4_0= ruleColor )
            	    // InternalSiriusTextDsl.g:4719:3: lv_colors_4_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPaletteAccess().getColorsColorParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_113);
            	    lv_colors_4_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPaletteRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"colors",
            	            		lv_colors_4_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop113;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getPaletteAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePalette"


    // $ANTLR start "entryRuleColor"
    // InternalSiriusTextDsl.g:4747:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalSiriusTextDsl.g:4748:2: (iv_ruleColor= ruleColor EOF )
            // InternalSiriusTextDsl.g:4749:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalSiriusTextDsl.g:4756:1: ruleColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4759:28: ( (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) ) )
            // InternalSiriusTextDsl.g:4760:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) )
            {
            // InternalSiriusTextDsl.g:4760:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) )
            // InternalSiriusTextDsl.g:4760:3: otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) )
            {
            otherlv_0=(Token)match(input,106,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
                
            // InternalSiriusTextDsl.g:4764:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:4765:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:4765:1: (lv_name_1_0= RULE_ID )
            // InternalSiriusTextDsl.g:4766:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			newLeafNode(lv_name_1_0, grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_114); 

                	newLeafNode(otherlv_2, grammarAccess.getColorAccess().getEqualsSignKeyword_2());
                
            // InternalSiriusTextDsl.g:4786:1: ( (lv_value_3_0= ruleColorValue ) )
            // InternalSiriusTextDsl.g:4787:1: (lv_value_3_0= ruleColorValue )
            {
            // InternalSiriusTextDsl.g:4787:1: (lv_value_3_0= ruleColorValue )
            // InternalSiriusTextDsl.g:4788:3: lv_value_3_0= ruleColorValue
            {
             
            	        newCompositeNode(grammarAccess.getColorAccess().getValueColorValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleColorValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColorRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ColorValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleColorValue"
    // InternalSiriusTextDsl.g:4812:1: entryRuleColorValue returns [EObject current=null] : iv_ruleColorValue= ruleColorValue EOF ;
    public final EObject entryRuleColorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorValue = null;


        try {
            // InternalSiriusTextDsl.g:4813:2: (iv_ruleColorValue= ruleColorValue EOF )
            // InternalSiriusTextDsl.g:4814:2: iv_ruleColorValue= ruleColorValue EOF
            {
             newCompositeNode(grammarAccess.getColorValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorValue=ruleColorValue();

            state._fsp--;

             current =iv_ruleColorValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColorValue"


    // $ANTLR start "ruleColorValue"
    // InternalSiriusTextDsl.g:4821:1: ruleColorValue returns [EObject current=null] : this_RGB_0= ruleRGB ;
    public final EObject ruleColorValue() throws RecognitionException {
        EObject current = null;

        EObject this_RGB_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4824:28: (this_RGB_0= ruleRGB )
            // InternalSiriusTextDsl.g:4826:5: this_RGB_0= ruleRGB
            {
             
                    newCompositeNode(grammarAccess.getColorValueAccess().getRGBParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_RGB_0=ruleRGB();

            state._fsp--;

             
                    current = this_RGB_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorValue"


    // $ANTLR start "entryRuleRGB"
    // InternalSiriusTextDsl.g:4842:1: entryRuleRGB returns [EObject current=null] : iv_ruleRGB= ruleRGB EOF ;
    public final EObject entryRuleRGB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGB = null;


        try {
            // InternalSiriusTextDsl.g:4843:2: (iv_ruleRGB= ruleRGB EOF )
            // InternalSiriusTextDsl.g:4844:2: iv_ruleRGB= ruleRGB EOF
            {
             newCompositeNode(grammarAccess.getRGBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRGB=ruleRGB();

            state._fsp--;

             current =iv_ruleRGB; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRGB"


    // $ANTLR start "ruleRGB"
    // InternalSiriusTextDsl.g:4851:1: ruleRGB returns [EObject current=null] : (otherlv_0= 'rgb(' ( (lv_red_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_green_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_blue_5_0= RULE_INT ) ) otherlv_6= ')' ) ;
    public final EObject ruleRGB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_red_1_0=null;
        Token otherlv_2=null;
        Token lv_green_3_0=null;
        Token otherlv_4=null;
        Token lv_blue_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4854:28: ( (otherlv_0= 'rgb(' ( (lv_red_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_green_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_blue_5_0= RULE_INT ) ) otherlv_6= ')' ) )
            // InternalSiriusTextDsl.g:4855:1: (otherlv_0= 'rgb(' ( (lv_red_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_green_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_blue_5_0= RULE_INT ) ) otherlv_6= ')' )
            {
            // InternalSiriusTextDsl.g:4855:1: (otherlv_0= 'rgb(' ( (lv_red_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_green_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_blue_5_0= RULE_INT ) ) otherlv_6= ')' )
            // InternalSiriusTextDsl.g:4855:3: otherlv_0= 'rgb(' ( (lv_red_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_green_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_blue_5_0= RULE_INT ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,107,FOLLOW_91); 

                	newLeafNode(otherlv_0, grammarAccess.getRGBAccess().getRgbKeyword_0());
                
            // InternalSiriusTextDsl.g:4859:1: ( (lv_red_1_0= RULE_INT ) )
            // InternalSiriusTextDsl.g:4860:1: (lv_red_1_0= RULE_INT )
            {
            // InternalSiriusTextDsl.g:4860:1: (lv_red_1_0= RULE_INT )
            // InternalSiriusTextDsl.g:4861:3: lv_red_1_0= RULE_INT
            {
            lv_red_1_0=(Token)match(input,RULE_INT,FOLLOW_61); 

            			newLeafNode(lv_red_1_0, grammarAccess.getRGBAccess().getRedINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"red",
                    		lv_red_1_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_91); 

                	newLeafNode(otherlv_2, grammarAccess.getRGBAccess().getCommaKeyword_2());
                
            // InternalSiriusTextDsl.g:4881:1: ( (lv_green_3_0= RULE_INT ) )
            // InternalSiriusTextDsl.g:4882:1: (lv_green_3_0= RULE_INT )
            {
            // InternalSiriusTextDsl.g:4882:1: (lv_green_3_0= RULE_INT )
            // InternalSiriusTextDsl.g:4883:3: lv_green_3_0= RULE_INT
            {
            lv_green_3_0=(Token)match(input,RULE_INT,FOLLOW_61); 

            			newLeafNode(lv_green_3_0, grammarAccess.getRGBAccess().getGreenINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"green",
                    		lv_green_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_91); 

                	newLeafNode(otherlv_4, grammarAccess.getRGBAccess().getCommaKeyword_4());
                
            // InternalSiriusTextDsl.g:4903:1: ( (lv_blue_5_0= RULE_INT ) )
            // InternalSiriusTextDsl.g:4904:1: (lv_blue_5_0= RULE_INT )
            {
            // InternalSiriusTextDsl.g:4904:1: (lv_blue_5_0= RULE_INT )
            // InternalSiriusTextDsl.g:4905:3: lv_blue_5_0= RULE_INT
            {
            lv_blue_5_0=(Token)match(input,RULE_INT,FOLLOW_49); 

            			newLeafNode(lv_blue_5_0, grammarAccess.getRGBAccess().getBlueINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"blue",
                    		lv_blue_5_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,49,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getRGBAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRGB"


    // $ANTLR start "ruleLabelAlignment"
    // InternalSiriusTextDsl.g:4933:1: ruleLabelAlignment returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) ;
    public final Enumerator ruleLabelAlignment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:4935:28: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) )
            // InternalSiriusTextDsl.g:4936:1: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            {
            // InternalSiriusTextDsl.g:4936:1: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            int alt114=3;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt114=1;
                }
                break;
            case 109:
                {
                alt114=2;
                }
                break;
            case 110:
                {
                alt114=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // InternalSiriusTextDsl.g:4936:2: (enumLiteral_0= 'left' )
                    {
                    // InternalSiriusTextDsl.g:4936:2: (enumLiteral_0= 'left' )
                    // InternalSiriusTextDsl.g:4936:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,108,FOLLOW_2); 

                            current = grammarAccess.getLabelAlignmentAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLabelAlignmentAccess().getLeftEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:4942:6: (enumLiteral_1= 'center' )
                    {
                    // InternalSiriusTextDsl.g:4942:6: (enumLiteral_1= 'center' )
                    // InternalSiriusTextDsl.g:4942:8: enumLiteral_1= 'center'
                    {
                    enumLiteral_1=(Token)match(input,109,FOLLOW_2); 

                            current = grammarAccess.getLabelAlignmentAccess().getCenterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLabelAlignmentAccess().getCenterEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:4948:6: (enumLiteral_2= 'right' )
                    {
                    // InternalSiriusTextDsl.g:4948:6: (enumLiteral_2= 'right' )
                    // InternalSiriusTextDsl.g:4948:8: enumLiteral_2= 'right'
                    {
                    enumLiteral_2=(Token)match(input,110,FOLLOW_2); 

                            current = grammarAccess.getLabelAlignmentAccess().getRightEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLabelAlignmentAccess().getRightEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelAlignment"


    // $ANTLR start "ruleGradientDirection"
    // InternalSiriusTextDsl.g:4958:1: ruleGradientDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) ) ;
    public final Enumerator ruleGradientDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:4960:28: ( ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) ) )
            // InternalSiriusTextDsl.g:4961:1: ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) )
            {
            // InternalSiriusTextDsl.g:4961:1: ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) )
            int alt115=3;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt115=1;
                }
                break;
            case 112:
                {
                alt115=2;
                }
                break;
            case 113:
                {
                alt115=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // InternalSiriusTextDsl.g:4961:2: (enumLiteral_0= 'oblique' )
                    {
                    // InternalSiriusTextDsl.g:4961:2: (enumLiteral_0= 'oblique' )
                    // InternalSiriusTextDsl.g:4961:4: enumLiteral_0= 'oblique'
                    {
                    enumLiteral_0=(Token)match(input,111,FOLLOW_2); 

                            current = grammarAccess.getGradientDirectionAccess().getObliqueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGradientDirectionAccess().getObliqueEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:4967:6: (enumLiteral_1= 'lefttoright' )
                    {
                    // InternalSiriusTextDsl.g:4967:6: (enumLiteral_1= 'lefttoright' )
                    // InternalSiriusTextDsl.g:4967:8: enumLiteral_1= 'lefttoright'
                    {
                    enumLiteral_1=(Token)match(input,112,FOLLOW_2); 

                            current = grammarAccess.getGradientDirectionAccess().getLefttorightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGradientDirectionAccess().getLefttorightEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:4973:6: (enumLiteral_2= 'toptobottom' )
                    {
                    // InternalSiriusTextDsl.g:4973:6: (enumLiteral_2= 'toptobottom' )
                    // InternalSiriusTextDsl.g:4973:8: enumLiteral_2= 'toptobottom'
                    {
                    enumLiteral_2=(Token)match(input,113,FOLLOW_2); 

                            current = grammarAccess.getGradientDirectionAccess().getToptobottomEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getGradientDirectionAccess().getToptobottomEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGradientDirection"


    // $ANTLR start "ruleLineStyle"
    // InternalSiriusTextDsl.g:4983:1: ruleLineStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) ) ;
    public final Enumerator ruleLineStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:4985:28: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) ) )
            // InternalSiriusTextDsl.g:4986:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) )
            {
            // InternalSiriusTextDsl.g:4986:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) )
            int alt116=4;
            switch ( input.LA(1) ) {
            case 114:
                {
                alt116=1;
                }
                break;
            case 115:
                {
                alt116=2;
                }
                break;
            case 116:
                {
                alt116=3;
                }
                break;
            case 117:
                {
                alt116=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // InternalSiriusTextDsl.g:4986:2: (enumLiteral_0= 'solid' )
                    {
                    // InternalSiriusTextDsl.g:4986:2: (enumLiteral_0= 'solid' )
                    // InternalSiriusTextDsl.g:4986:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,114,FOLLOW_2); 

                            current = grammarAccess.getLineStyleAccess().getSolidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLineStyleAccess().getSolidEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:4992:6: (enumLiteral_1= 'dash' )
                    {
                    // InternalSiriusTextDsl.g:4992:6: (enumLiteral_1= 'dash' )
                    // InternalSiriusTextDsl.g:4992:8: enumLiteral_1= 'dash'
                    {
                    enumLiteral_1=(Token)match(input,115,FOLLOW_2); 

                            current = grammarAccess.getLineStyleAccess().getDashEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLineStyleAccess().getDashEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:4998:6: (enumLiteral_2= 'dot' )
                    {
                    // InternalSiriusTextDsl.g:4998:6: (enumLiteral_2= 'dot' )
                    // InternalSiriusTextDsl.g:4998:8: enumLiteral_2= 'dot'
                    {
                    enumLiteral_2=(Token)match(input,116,FOLLOW_2); 

                            current = grammarAccess.getLineStyleAccess().getDotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLineStyleAccess().getDotEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:5004:6: (enumLiteral_3= 'dash_dot' )
                    {
                    // InternalSiriusTextDsl.g:5004:6: (enumLiteral_3= 'dash_dot' )
                    // InternalSiriusTextDsl.g:5004:8: enumLiteral_3= 'dash_dot'
                    {
                    enumLiteral_3=(Token)match(input,117,FOLLOW_2); 

                            current = grammarAccess.getLineStyleAccess().getDash_dotEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLineStyleAccess().getDash_dotEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLineStyle"


    // $ANTLR start "ruleRoutingStyle"
    // InternalSiriusTextDsl.g:5014:1: ruleRoutingStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'straight' ) | (enumLiteral_1= 'manhattan' ) | (enumLiteral_2= 'tree' ) ) ;
    public final Enumerator ruleRoutingStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:5016:28: ( ( (enumLiteral_0= 'straight' ) | (enumLiteral_1= 'manhattan' ) | (enumLiteral_2= 'tree' ) ) )
            // InternalSiriusTextDsl.g:5017:1: ( (enumLiteral_0= 'straight' ) | (enumLiteral_1= 'manhattan' ) | (enumLiteral_2= 'tree' ) )
            {
            // InternalSiriusTextDsl.g:5017:1: ( (enumLiteral_0= 'straight' ) | (enumLiteral_1= 'manhattan' ) | (enumLiteral_2= 'tree' ) )
            int alt117=3;
            switch ( input.LA(1) ) {
            case 118:
                {
                alt117=1;
                }
                break;
            case 119:
                {
                alt117=2;
                }
                break;
            case 120:
                {
                alt117=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // InternalSiriusTextDsl.g:5017:2: (enumLiteral_0= 'straight' )
                    {
                    // InternalSiriusTextDsl.g:5017:2: (enumLiteral_0= 'straight' )
                    // InternalSiriusTextDsl.g:5017:4: enumLiteral_0= 'straight'
                    {
                    enumLiteral_0=(Token)match(input,118,FOLLOW_2); 

                            current = grammarAccess.getRoutingStyleAccess().getStraightEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRoutingStyleAccess().getStraightEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:5023:6: (enumLiteral_1= 'manhattan' )
                    {
                    // InternalSiriusTextDsl.g:5023:6: (enumLiteral_1= 'manhattan' )
                    // InternalSiriusTextDsl.g:5023:8: enumLiteral_1= 'manhattan'
                    {
                    enumLiteral_1=(Token)match(input,119,FOLLOW_2); 

                            current = grammarAccess.getRoutingStyleAccess().getManhattanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRoutingStyleAccess().getManhattanEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:5029:6: (enumLiteral_2= 'tree' )
                    {
                    // InternalSiriusTextDsl.g:5029:6: (enumLiteral_2= 'tree' )
                    // InternalSiriusTextDsl.g:5029:8: enumLiteral_2= 'tree'
                    {
                    enumLiteral_2=(Token)match(input,120,FOLLOW_2); 

                            current = grammarAccess.getRoutingStyleAccess().getTreeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRoutingStyleAccess().getTreeEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoutingStyle"


    // $ANTLR start "ruleArrowDecorator"
    // InternalSiriusTextDsl.g:5039:1: ruleArrowDecorator returns [Enumerator current=null] : ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWithFillDiamond' ) ) ;
    public final Enumerator ruleArrowDecorator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:5041:28: ( ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWithFillDiamond' ) ) )
            // InternalSiriusTextDsl.g:5042:1: ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWithFillDiamond' ) )
            {
            // InternalSiriusTextDsl.g:5042:1: ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWithFillDiamond' ) )
            int alt118=11;
            switch ( input.LA(1) ) {
            case 121:
                {
                alt118=1;
                }
                break;
            case 122:
                {
                alt118=2;
                }
                break;
            case 123:
                {
                alt118=3;
                }
                break;
            case 124:
                {
                alt118=4;
                }
                break;
            case 125:
                {
                alt118=5;
                }
                break;
            case 126:
                {
                alt118=6;
                }
                break;
            case 127:
                {
                alt118=7;
                }
                break;
            case 128:
                {
                alt118=8;
                }
                break;
            case 129:
                {
                alt118=9;
                }
                break;
            case 130:
                {
                alt118=10;
                }
                break;
            case 131:
                {
                alt118=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // InternalSiriusTextDsl.g:5042:2: (enumLiteral_0= 'NoDecoration' )
                    {
                    // InternalSiriusTextDsl.g:5042:2: (enumLiteral_0= 'NoDecoration' )
                    // InternalSiriusTextDsl.g:5042:4: enumLiteral_0= 'NoDecoration'
                    {
                    enumLiteral_0=(Token)match(input,121,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getNoDecorationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getArrowDecoratorAccess().getNoDecorationEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:5048:6: (enumLiteral_1= 'OutputArrow' )
                    {
                    // InternalSiriusTextDsl.g:5048:6: (enumLiteral_1= 'OutputArrow' )
                    // InternalSiriusTextDsl.g:5048:8: enumLiteral_1= 'OutputArrow'
                    {
                    enumLiteral_1=(Token)match(input,122,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getOutputArrowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getArrowDecoratorAccess().getOutputArrowEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:5054:6: (enumLiteral_2= 'InputArrow' )
                    {
                    // InternalSiriusTextDsl.g:5054:6: (enumLiteral_2= 'InputArrow' )
                    // InternalSiriusTextDsl.g:5054:8: enumLiteral_2= 'InputArrow'
                    {
                    enumLiteral_2=(Token)match(input,123,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputArrowEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getArrowDecoratorAccess().getInputArrowEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:5060:6: (enumLiteral_3= 'OutputClosedArrow' )
                    {
                    // InternalSiriusTextDsl.g:5060:6: (enumLiteral_3= 'OutputClosedArrow' )
                    // InternalSiriusTextDsl.g:5060:8: enumLiteral_3= 'OutputClosedArrow'
                    {
                    enumLiteral_3=(Token)match(input,124,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getOutputClosedArrowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getArrowDecoratorAccess().getOutputClosedArrowEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalSiriusTextDsl.g:5066:6: (enumLiteral_4= 'InputClosedArrow' )
                    {
                    // InternalSiriusTextDsl.g:5066:6: (enumLiteral_4= 'InputClosedArrow' )
                    // InternalSiriusTextDsl.g:5066:8: enumLiteral_4= 'InputClosedArrow'
                    {
                    enumLiteral_4=(Token)match(input,125,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputClosedArrowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getArrowDecoratorAccess().getInputClosedArrowEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalSiriusTextDsl.g:5072:6: (enumLiteral_5= 'OutputFillClosedArrow' )
                    {
                    // InternalSiriusTextDsl.g:5072:6: (enumLiteral_5= 'OutputFillClosedArrow' )
                    // InternalSiriusTextDsl.g:5072:8: enumLiteral_5= 'OutputFillClosedArrow'
                    {
                    enumLiteral_5=(Token)match(input,126,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getOutputFillClosedArrowEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getArrowDecoratorAccess().getOutputFillClosedArrowEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalSiriusTextDsl.g:5078:6: (enumLiteral_6= 'InputFillClosedArrow' )
                    {
                    // InternalSiriusTextDsl.g:5078:6: (enumLiteral_6= 'InputFillClosedArrow' )
                    // InternalSiriusTextDsl.g:5078:8: enumLiteral_6= 'InputFillClosedArrow'
                    {
                    enumLiteral_6=(Token)match(input,127,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputFillClosedArrowEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getArrowDecoratorAccess().getInputFillClosedArrowEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // InternalSiriusTextDsl.g:5084:6: (enumLiteral_7= 'Diamond' )
                    {
                    // InternalSiriusTextDsl.g:5084:6: (enumLiteral_7= 'Diamond' )
                    // InternalSiriusTextDsl.g:5084:8: enumLiteral_7= 'Diamond'
                    {
                    enumLiteral_7=(Token)match(input,128,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getDiamondEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getArrowDecoratorAccess().getDiamondEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // InternalSiriusTextDsl.g:5090:6: (enumLiteral_8= 'FillDiamond' )
                    {
                    // InternalSiriusTextDsl.g:5090:6: (enumLiteral_8= 'FillDiamond' )
                    // InternalSiriusTextDsl.g:5090:8: enumLiteral_8= 'FillDiamond'
                    {
                    enumLiteral_8=(Token)match(input,129,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getFillDiamondEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getArrowDecoratorAccess().getFillDiamondEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // InternalSiriusTextDsl.g:5096:6: (enumLiteral_9= 'InputArrowWithDiamond' )
                    {
                    // InternalSiriusTextDsl.g:5096:6: (enumLiteral_9= 'InputArrowWithDiamond' )
                    // InternalSiriusTextDsl.g:5096:8: enumLiteral_9= 'InputArrowWithDiamond'
                    {
                    enumLiteral_9=(Token)match(input,130,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputArrowWithDiamondEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getArrowDecoratorAccess().getInputArrowWithDiamondEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // InternalSiriusTextDsl.g:5102:6: (enumLiteral_10= 'InputArrowWithFillDiamond' )
                    {
                    // InternalSiriusTextDsl.g:5102:6: (enumLiteral_10= 'InputArrowWithFillDiamond' )
                    // InternalSiriusTextDsl.g:5102:8: enumLiteral_10= 'InputArrowWithFillDiamond'
                    {
                    enumLiteral_10=(Token)match(input,131,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputArrowWithFillDiamondEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getArrowDecoratorAccess().getInputArrowWithFillDiamondEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrowDecorator"


    // $ANTLR start "ruleFoldingStyle"
    // InternalSiriusTextDsl.g:5112:1: ruleFoldingStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'target' ) ) ;
    public final Enumerator ruleFoldingStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:5114:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'target' ) ) )
            // InternalSiriusTextDsl.g:5115:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'target' ) )
            {
            // InternalSiriusTextDsl.g:5115:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'target' ) )
            int alt119=3;
            switch ( input.LA(1) ) {
            case 132:
                {
                alt119=1;
                }
                break;
            case 133:
                {
                alt119=2;
                }
                break;
            case 134:
                {
                alt119=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // InternalSiriusTextDsl.g:5115:2: (enumLiteral_0= 'none' )
                    {
                    // InternalSiriusTextDsl.g:5115:2: (enumLiteral_0= 'none' )
                    // InternalSiriusTextDsl.g:5115:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,132,FOLLOW_2); 

                            current = grammarAccess.getFoldingStyleAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFoldingStyleAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:5121:6: (enumLiteral_1= 'source' )
                    {
                    // InternalSiriusTextDsl.g:5121:6: (enumLiteral_1= 'source' )
                    // InternalSiriusTextDsl.g:5121:8: enumLiteral_1= 'source'
                    {
                    enumLiteral_1=(Token)match(input,133,FOLLOW_2); 

                            current = grammarAccess.getFoldingStyleAccess().getSourceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFoldingStyleAccess().getSourceEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:5127:6: (enumLiteral_2= 'target' )
                    {
                    // InternalSiriusTextDsl.g:5127:6: (enumLiteral_2= 'target' )
                    // InternalSiriusTextDsl.g:5127:8: enumLiteral_2= 'target'
                    {
                    enumLiteral_2=(Token)match(input,134,FOLLOW_2); 

                            current = grammarAccess.getFoldingStyleAccess().getTargetEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFoldingStyleAccess().getTargetEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFoldingStyle"


    // $ANTLR start "ruleEndsCentering"
    // InternalSiriusTextDsl.g:5137:1: ruleEndsCentering returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'both' ) | (enumLiteral_2= 'source' ) | (enumLiteral_3= 'target' ) ) ;
    public final Enumerator ruleEndsCentering() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:5139:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'both' ) | (enumLiteral_2= 'source' ) | (enumLiteral_3= 'target' ) ) )
            // InternalSiriusTextDsl.g:5140:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'both' ) | (enumLiteral_2= 'source' ) | (enumLiteral_3= 'target' ) )
            {
            // InternalSiriusTextDsl.g:5140:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'both' ) | (enumLiteral_2= 'source' ) | (enumLiteral_3= 'target' ) )
            int alt120=4;
            switch ( input.LA(1) ) {
            case 132:
                {
                alt120=1;
                }
                break;
            case 135:
                {
                alt120=2;
                }
                break;
            case 133:
                {
                alt120=3;
                }
                break;
            case 134:
                {
                alt120=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // InternalSiriusTextDsl.g:5140:2: (enumLiteral_0= 'none' )
                    {
                    // InternalSiriusTextDsl.g:5140:2: (enumLiteral_0= 'none' )
                    // InternalSiriusTextDsl.g:5140:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,132,FOLLOW_2); 

                            current = grammarAccess.getEndsCenteringAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEndsCenteringAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:5146:6: (enumLiteral_1= 'both' )
                    {
                    // InternalSiriusTextDsl.g:5146:6: (enumLiteral_1= 'both' )
                    // InternalSiriusTextDsl.g:5146:8: enumLiteral_1= 'both'
                    {
                    enumLiteral_1=(Token)match(input,135,FOLLOW_2); 

                            current = grammarAccess.getEndsCenteringAccess().getBothEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getEndsCenteringAccess().getBothEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:5152:6: (enumLiteral_2= 'source' )
                    {
                    // InternalSiriusTextDsl.g:5152:6: (enumLiteral_2= 'source' )
                    // InternalSiriusTextDsl.g:5152:8: enumLiteral_2= 'source'
                    {
                    enumLiteral_2=(Token)match(input,133,FOLLOW_2); 

                            current = grammarAccess.getEndsCenteringAccess().getSourceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getEndsCenteringAccess().getSourceEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:5158:6: (enumLiteral_3= 'target' )
                    {
                    // InternalSiriusTextDsl.g:5158:6: (enumLiteral_3= 'target' )
                    // InternalSiriusTextDsl.g:5158:8: enumLiteral_3= 'target'
                    {
                    enumLiteral_3=(Token)match(input,134,FOLLOW_2); 

                            current = grammarAccess.getEndsCenteringAccess().getTargetEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getEndsCenteringAccess().getTargetEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndsCentering"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\1\16\11\uffff";
    static final String dfa_3s = "\2\151\11\uffff";
    static final String dfa_4s = "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\11\uffff\1\2\13\uffff\4\3\12\uffff\1\4\3\uffff\1\11\1\uffff\2\12\40\uffff\2\5\2\uffff\1\6\10\uffff\1\10\3\uffff\1\6\7\uffff\1\7",
            "\1\2\13\uffff\4\3\12\uffff\1\4\3\uffff\1\11\1\uffff\2\12\40\uffff\2\5\2\uffff\1\6\10\uffff\1\10\13\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "178:1: (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge | this_Section_7= ruleSection | this_Tool_8= ruleTool )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000D1003C006010L,0x0000020220130000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000030A0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000F800020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000F000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000E000020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000C000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000E0001020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000E0000020000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000C0000020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200001020000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000400018000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0010000001000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0xA680000200020000L,0x0000000000002D24L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0002000000400000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000020000L,0x000000000000C000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000020000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0003800000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000001020000L,0x000000001A800000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000700000000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000001020000L,0x000000001A000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000001020000L,0x0000000018000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000020000L,0x0000000018000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000020000L,0x0000000010000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000010000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x003C000000000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000010000L,0x0000000800000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x01C0000000000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000020000L,0x000001F000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0xFE00000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000020000L,0x000001E000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000020000L,0x000001C000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000020000L,0x0000018000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000020000L,0x0000010000000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000020000L,0x0000040000000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});

}